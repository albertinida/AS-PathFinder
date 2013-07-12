package it.uninsubria.dista.pathfinder.models;

import java.math.BigInteger;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Coefficient {
	
	@NotNull
	@Min(0l)
	private long degree;
	
	@NotNull
	private BigInteger value;
	
}
