package com.jgvg.test_bcnc_group.controllers
import com.jgvg.test_bcnc_group.models.Album
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.util.Collections.emptyList

@RestController
@RequestMapping("/albums")
class AlbumController {

    val restTemplate = RestTemplate()

    @GetMapping
    fun getAlbums(): List<Album> {
        val albumsList = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/albums",
                Array<Album>::class.java
        )

        return albumsList?.toList() ?: emptyList()
    }
}