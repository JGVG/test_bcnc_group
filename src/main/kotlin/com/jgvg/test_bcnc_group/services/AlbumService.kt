package com.jgvg.test_bcnc_group.services

import com.jgvg.test_bcnc_group.interfaces.IAlbumService
import com.jgvg.test_bcnc_group.models.Album
import com.jgvg.test_bcnc_group.models.Photo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.client.RestTemplate
import java.util.*

@Service
class AlbumService: IAlbumService{

    val restTemplate = RestTemplate()

    override fun getAlbums(): List<Album> {
        val albumsList = restTemplate.getForObject(
            "https://jsonplaceholder.typicode.com/albums",
            Array<Album>::class.java
        )

        return albumsList?.toList() ?: Collections.emptyList()
    }

    override fun getPhotoByAlbum(@PathVariable id: Int): List<Photo> {
        val photosList = restTemplate.getForObject(
            "https://jsonplaceholder.typicode.com/photos?albumId=$id",
            Array<Photo>::class.java
        )

        return photosList?.toList() ?: Collections.emptyList()
    }
}