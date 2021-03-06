package LW3;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: C2_Skills_Read_all_texts <br>
 * @version generated on Sun Oct 04 15:40:40 MSK 2020 by Katherina
 */

public interface C2_Skills_Read_all_texts extends Skills {

    /* ***************************************************
     * Property http://www.semanticweb.org/katherina/ontologies/2020/9/untitled-ontology-9#C2_can
     */
     
    /**
     * Gets all property values for the C2_can property.<p>
     * 
     * @returns a collection of values for the C2_can property.
     */
    Collection<? extends Level_C2> getC2_can();

    /**
     * Checks if the class has a C2_can property value.<p>
     * 
     * @return true if there is a C2_can property value.
     */
    boolean hasC2_can();

    /**
     * Adds a C2_can property value.<p>
     * 
     * @param newC2_can the C2_can property value to be added
     */
    void addC2_can(Level_C2 newC2_can);

    /**
     * Removes a C2_can property value.<p>
     * 
     * @param oldC2_can the C2_can property value to be removed.
     */
    void removeC2_can(Level_C2 oldC2_can);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
