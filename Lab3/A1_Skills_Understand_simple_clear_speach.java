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
 * Source Class: A1_Skills_Understand_simple_clear_speach <br>
 * @version generated on Sun Oct 04 15:40:40 MSK 2020 by Katherina
 */

public interface A1_Skills_Understand_simple_clear_speach extends Skills {

    /* ***************************************************
     * Property http://www.semanticweb.org/katherina/ontologies/2020/9/untitled-ontology-9#A1_can
     */
     
    /**
     * Gets all property values for the A1_can property.<p>
     * 
     * @returns a collection of values for the A1_can property.
     */
    Collection<? extends Level_A1> getA1_can();

    /**
     * Checks if the class has a A1_can property value.<p>
     * 
     * @return true if there is a A1_can property value.
     */
    boolean hasA1_can();

    /**
     * Adds a A1_can property value.<p>
     * 
     * @param newA1_can the A1_can property value to be added
     */
    void addA1_can(Level_A1 newA1_can);

    /**
     * Removes a A1_can property value.<p>
     * 
     * @param oldA1_can the A1_can property value to be removed.
     */
    void removeA1_can(Level_A1 oldA1_can);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
