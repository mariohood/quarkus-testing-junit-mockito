package br.com.mariohood;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
class MovieRepositoryTest {
   
    @Inject MovieRepository movieRepository;

    @Test
    void findByCountryOK() {

        List<Movie> movies = movieRepository.findByCountry("Planet");
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        assertEquals(2, movies.size());
        assertEquals(2L, movies.get(0).getId());
        assertEquals("SecondMovie", movies.get(0).getTitle());
        assertEquals("MySecondMovie", movies.get(0).getDescription());
        assertEquals("Me", movies.get(0).getDirector());
        assertEquals("Planet", movies.get(0).getCountry());
    }

    @Test
    void findByCountryKO() {

        List<Movie> movies = movieRepository.findByCountry("Tierrita");
        assertNotNull(movies);
        assertTrue(movies.isEmpty());
        
    }
}
