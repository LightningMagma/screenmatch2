package com.modules.screenmatch2.repository;

import com.modules.screenmatch2.model.Categoria;
import com.modules.screenmatch2.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByOrderByEvaluacionDesc();

    List<Serie> findByGenero(Categoria categoria);

    //List<Serie> findByTotalTemporadasLessThanEqualAndEvaluacionGreaterThanEqual(int totalTemporadas, Double evaluacion);
    @Query("select s from Serie s where totalTemporadas <= :totalTemporadas and evaluacion >= :evaluacion")
    List<Serie> seriesPorTemporadaYEvaluación(int totalTemporadas, Double evaluacion);
}
