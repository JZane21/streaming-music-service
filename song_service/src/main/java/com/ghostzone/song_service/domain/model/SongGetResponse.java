package com.ghostzone.song_service.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SongGetResponse {
    private String songName;
    private long artistId;
    private String cover;
}
