package com.jgvg.test_bcnc_group.controllers
import com.jgvg.test_bcnc_group.models.Album
import com.jgvg.test_bcnc_group.models.Photo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.util.Collections.emptyList

@RestController
@RequestMapping("/albums")
class AlbumController {

    val restTemplate = RestTemplate()

    @GetMapping
    fun getAlbums(): List<Album> { // Ej: http://localhost:8080/albums
        val albumsList = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/albums",
                Array<Album>::class.java
        )

        return albumsList?.toList() ?: emptyList()
    }

    @GetMapping("/{id}/photos")
    fun getPhotoByAlbum(@PathVariable id: Int): List<Photo> { // Ej: http://localhost:8080/albums/2/photos
        val photosList = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/photos?albumId=$id",
                Array<Photo>::class.java
        )

        return photosList?.toList() ?: emptyList()
    }
}