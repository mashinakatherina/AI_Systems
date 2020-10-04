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
 * Source Class: B1_Skills_Describe_hopes <br>
 * @version generated on Sun Oct 04 15:40:40 MSK 2020 by Katherina
 */

public interface B1_Skills_Describe_hopes extends Skills {

    /* ***************************************************
     * Property http://www.semanticweb.org/katherina/ontologies/2020/9/untitled-ontology-9#B1_can
     */
     
    /**
     * Gets all property values for the B1_can property.<p>
     * 
     * @returns a collection of values for the B1_can property.
     */
    Collection<? extends Level_B1> getB1_can();

    /**
     * Checks if the class has a B1_can property value.<p>
     * 
     * @return true if there is a B1_can property value.
     */
    boolean hasB1_can();

    /**
     * Adds a B1_can property value.<p>
     * 
     * @param newB1_can the B1_can property value to be added
     */
    void addB1_can(Level_B1 newB1_can);

    /**
     * Removes a B1_can property value.<p>
     * 
     * @param oldB1_can the B1_can property value to be removed.
     */
    void removeB1_can(Level_B1 oldB1_can);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
