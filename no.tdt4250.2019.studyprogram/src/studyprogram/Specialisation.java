/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.Specialisation#getYears <em>Years</em>}</li>
 *   <li>{@link studyprogram.Specialisation#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getSpecialisation_Years()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Year> getYears();

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.StudyPlan#getSpesialisations <em>Spesialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see studyprogram.StudyprogramPackage#getSpecialisation_StudyPlan()
	 * @see studyprogram.StudyPlan#getSpesialisations
	 * @model opposite="spesialisations" transient="false"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link studyprogram.Specialisation#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // Specialisation
