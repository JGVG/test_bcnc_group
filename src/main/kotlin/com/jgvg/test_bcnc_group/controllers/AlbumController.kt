package com.jgvg.test_bcnc_group.controllers
import com.jgvg.test_bcnc_group.interfaces.IAlbumService
import com.jgvg.test_bcnc_group.models.Album
import com.jgvg.test_bcnc_group.models.Photo
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/albums")
class AlbumController{

    @Autowired
    private val service: IAlbumService? = null

    @Operation(summary = "Obtener los álbumes de JSON Placeholder")
    @GetMapping
    fun getAlbums(): List<Album>? { // Ej: http://localhost:8080/albums
        return service?.albums
    }
    @Operation(summary = "Obtener los las fotos pertenecientes de un album de JSON Placeholder")
    @GetMapping("/{id}/photos")
    fun getPhotoByAlbum(@PathVariable id: Int): List<Photo>? { // Ej: http://localhost:8080/albums/2/photos
        return service?.getPhotoByAlbum(id)

    }
}