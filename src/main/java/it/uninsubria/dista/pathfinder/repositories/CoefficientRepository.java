package it.uninsubria.dista.pathfinder.repositories;

import it.uninsubria.dista.pathfinder.models.Coefficient;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Coefficient.class)
public interface CoefficientRepository {
}
