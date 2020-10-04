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
 * Source Class: A2_Knowledges_Prepositions <br>
 * @version generated on Sun Oct 04 15:40:40 MSK 2020 by Katherina
 */

public interface A2_Knowledges_Prepositions extends Knowledges {

    /* ***************************************************
     * Property http://www.semanticweb.org/katherina/ontologies/2020/9/untitled-ontology-9#A2_knows
     */
     
    /**
     * Gets all property values for the A2_knows property.<p>
     * 
     * @returns a collection of values for the A2_knows property.
     */
    Collection<? extends Level_A2> getA2_knows();

    /**
     * Checks if the class has a A2_knows property value.<p>
     * 
     * @return true if there is a A2_knows property value.
     */
    boolean hasA2_knows();

    /**
     * Adds a A2_knows property value.<p>
     * 
     * @param newA2_knows the A2_knows property value to be added
     */
    void addA2_knows(Level_A2 newA2_knows);

    /**
     * Removes a A2_knows property value.<p>
     * 
     * @param oldA2_knows the A2_knows property value to be removed.
     */
    void removeA2_knows(Level_A2 oldA2_knows);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
