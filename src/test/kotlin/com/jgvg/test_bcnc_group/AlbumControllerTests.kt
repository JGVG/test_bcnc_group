package com.jgvg.test_bcnc_group

import com.jgvg.test_bcnc_group.controllers.AlbumController
import com.jgvg.test_bcnc_group.models.Photo
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.client.RestTemplate
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(AlbumController::class)
class AlbumControllerTests {

	@InjectMocks
	private lateinit var albumController: AlbumController

	@Mock
	private lateinit var restTemplate: RestTemplate

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Test
	fun testGetPhotoByAlbum() {
		val id = 1
		val samplePhotos = arrayOf(Photo(1, 1, "Title 1", "url1", "thumbnailUrl1"))

		`when`(
			restTemplate.getForObject(
				"https://jsonplaceholder.typicode.com/photos?albumId=$id",
				Array<Photo>::class.java
			)
		).thenReturn(samplePhotos)

		// Se realiza una solicitud HTTP simulada y verificar el resultado de la solicitud.
		mockMvc.perform(get("/albums/$id/photos")).andExpect(status().isOk)

	}

}
