/**
 */
package studyprogram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import studyprogram.Program;
import studyprogram.Specialisation;
import studyprogram.StudyPlan;
import studyprogram.StudyprogramPackage;
import studyprogram.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.StudyPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.StudyPlanImpl#getYears <em>Years</em>}</li>
 *   <li>{@link studyprogram.impl.StudyPlanImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link studyprogram.impl.StudyPlanImpl#getSpesialisations <em>Spesialisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> years;

	/**
	 * The cached value of the '{@link #getSpesialisations() <em>Spesialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpesialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> spesialisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.STUDY_PLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentWithInverseEList<Year>(Year.class, this, StudyprogramPackage.STUDY_PLAN__YEARS, StudyprogramPackage.YEAR__STUDY_PLAN);
		}
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (eContainerFeatureID() != StudyprogramPackage.STUDY_PLAN__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyprogramPackage.STUDY_PLAN__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyprogramPackage.STUDY_PLAN__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyprogramPackage.PROGRAM__STUDY_PLANS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.STUDY_PLAN__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSpesialisations() {
		if (spesialisations == null) {
			spesialisations = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS, StudyprogramPackage.SPECIALISATION__STUDY_PLAN);
		}
		return spesialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getYears()).basicAdd(otherEnd, msgs);
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpesialisations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				return ((InternalEList<?>)getYears()).basicRemove(otherEnd, msgs);
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				return basicSetProgram(null, msgs);
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				return ((InternalEList<?>)getSpesialisations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyprogramPackage.PROGRAM__STUDY_PLANS, Program.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__NAME:
				return getName();
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				return getYears();
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				return getProgram();
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				return getSpesialisations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				getYears().clear();
				getYears().addAll((Collection<? extends Year>)newValue);
				return;
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				setProgram((Program)newValue);
				return;
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				getSpesialisations().clear();
				getSpesialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				getYears().clear();
				return;
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				setProgram((Program)null);
				return;
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				getSpesialisations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.STUDY_PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.STUDY_PLAN__YEARS:
				return years != null && !years.isEmpty();
			case StudyprogramPackage.STUDY_PLAN__PROGRAM:
				return getProgram() != null;
			case StudyprogramPackage.STUDY_PLAN__SPESIALISATIONS:
				return spesialisations != null && !spesialisations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StudyPlanImpl
