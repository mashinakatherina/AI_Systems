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
 * Source Class: C1_Skills_Produce_clear_wellstructured_text <br>
 * @version generated on Sun Oct 04 15:40:40 MSK 2020 by Katherina
 */

public interface C1_Skills_Produce_clear_wellstructured_text extends Skills {

    /* ***************************************************
     * Property http://www.semanticweb.org/katherina/ontologies/2020/9/untitled-ontology-9#C1_can
     */
     
    /**
     * Gets all property values for the C1_can property.<p>
     * 
     * @returns a collection of values for the C1_can property.
     */
    Collection<? extends Level_C1> getC1_can();

    /**
     * Checks if the class has a C1_can property value.<p>
     * 
     * @return true if there is a C1_can property value.
     */
    boolean hasC1_can();

    /**
     * Adds a C1_can property value.<p>
     * 
     * @param newC1_can the C1_can property value to be added
     */
    void addC1_can(Level_C1 newC1_can);

    /**
     * Removes a C1_can property value.<p>
     * 
     * @param oldC1_can the C1_can property value to be removed.
     */
    void removeC1_can(Level_C1 oldC1_can);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
