package com.modules.screenmatch2.dto;

import com.modules.screenmatch2.model.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(String titulo,
                       Integer totalTemporadas,
                       Double evaluacion,
                       String poster,
                       Categoria genero,
                       String actores,
                       String sinopsis) {
}
