// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package it.uninsubria.dista.pathfinder.models;

import it.uninsubria.dista.pathfinder.models.Polynomial;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Polynomial_Roo_Jpa_Entity {
    
    declare @type: Polynomial: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Polynomial.id;
    
    @Version
    @Column(name = "version")
    private Integer Polynomial.version;
    
    public Long Polynomial.getId() {
        return this.id;
    }
    
    public void Polynomial.setId(Long id) {
        this.id = id;
    }
    
    public Integer Polynomial.getVersion() {
        return this.version;
    }
    
    public void Polynomial.setVersion(Integer version) {
        this.version = version;
    }
    
}
