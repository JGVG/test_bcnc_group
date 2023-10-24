package com.jgvg.test_bcnc_group.interfaces;

import com.jgvg.test_bcnc_group.models.Album;
import com.jgvg.test_bcnc_group.models.Photo;

import java.util.List;

public interface IAlbumService {
    public List<Album> getAlbums();
    public List<Photo> getPhotoByAlbum(int id);
}