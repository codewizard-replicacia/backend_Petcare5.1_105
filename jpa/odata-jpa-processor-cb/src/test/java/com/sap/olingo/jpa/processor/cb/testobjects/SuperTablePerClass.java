package com.sap.olingo.jpa.processor.cb.testobjects;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "Super")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SuperTablePerClass {

}
