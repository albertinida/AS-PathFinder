package it.uninsubria.dista.pathfinder.repositories;

import it.uninsubria.dista.pathfinder.models.Polynomial;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Polynomial.class)
public interface PolynomialRepository {
}
