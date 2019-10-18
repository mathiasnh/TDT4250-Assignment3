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

import studyprogram.Department;
import studyprogram.ElectiveCourses;
import studyprogram.ObligatoryCourses;
import studyprogram.Program;
import studyprogram.StudyPlan;
import studyprogram.StudyprogramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getStudyPlans <em>Study Plans</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getObligatoryCourses <em>Obligatory Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getStudyPlans() <em>Study Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlan> studyPlans;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected ElectiveCourses electiveCourses;

	/**
	 * The cached value of the '{@link #getObligatoryCourses() <em>Obligatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected ObligatoryCourses obligatoryCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != StudyprogramPackage.PROGRAM__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, StudyprogramPackage.PROGRAM__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != StudyprogramPackage.PROGRAM__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, StudyprogramPackage.DEPARTMENT__PROGRAMS, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyPlan> getStudyPlans() {
		if (studyPlans == null) {
			studyPlans = new EObjectContainmentWithInverseEList<StudyPlan>(StudyPlan.class, this, StudyprogramPackage.PROGRAM__STUDY_PLANS, StudyprogramPackage.STUDY_PLAN__PROGRAM);
		}
		return studyPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourses getElectiveCourses() {
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectiveCourses(ElectiveCourses newElectiveCourses, NotificationChain msgs) {
		ElectiveCourses oldElectiveCourses = electiveCourses;
		electiveCourses = newElectiveCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__ELECTIVE_COURSES, oldElectiveCourses, newElectiveCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectiveCourses(ElectiveCourses newElectiveCourses) {
		if (newElectiveCourses != electiveCourses) {
			NotificationChain msgs = null;
			if (electiveCourses != null)
				msgs = ((InternalEObject)electiveCourses).eInverseRemove(this, StudyprogramPackage.ELECTIVE_COURSES__PROGRAM, ElectiveCourses.class, msgs);
			if (newElectiveCourses != null)
				msgs = ((InternalEObject)newElectiveCourses).eInverseAdd(this, StudyprogramPackage.ELECTIVE_COURSES__PROGRAM, ElectiveCourses.class, msgs);
			msgs = basicSetElectiveCourses(newElectiveCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__ELECTIVE_COURSES, newElectiveCourses, newElectiveCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligatoryCourses getObligatoryCourses() {
		return obligatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObligatoryCourses(ObligatoryCourses newObligatoryCourses, NotificationChain msgs) {
		ObligatoryCourses oldObligatoryCourses = obligatoryCourses;
		obligatoryCourses = newObligatoryCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES, oldObligatoryCourses, newObligatoryCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligatoryCourses(ObligatoryCourses newObligatoryCourses) {
		if (newObligatoryCourses != obligatoryCourses) {
			NotificationChain msgs = null;
			if (obligatoryCourses != null)
				msgs = ((InternalEObject)obligatoryCourses).eInverseRemove(this, StudyprogramPackage.OBLIGATORY_COURSES__PROGRAM, ObligatoryCourses.class, msgs);
			if (newObligatoryCourses != null)
				msgs = ((InternalEObject)newObligatoryCourses).eInverseAdd(this, StudyprogramPackage.OBLIGATORY_COURSES__PROGRAM, ObligatoryCourses.class, msgs);
			msgs = basicSetObligatoryCourses(newObligatoryCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES, newObligatoryCourses, newObligatoryCourses));
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
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyPlans()).basicAdd(otherEnd, msgs);
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				if (electiveCourses != null)
					msgs = ((InternalEObject)electiveCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyprogramPackage.PROGRAM__ELECTIVE_COURSES, null, msgs);
				return basicSetElectiveCourses((ElectiveCourses)otherEnd, msgs);
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				if (obligatoryCourses != null)
					msgs = ((InternalEObject)obligatoryCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES, null, msgs);
				return basicSetObligatoryCourses((ObligatoryCourses)otherEnd, msgs);
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
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				return ((InternalEList<?>)getStudyPlans()).basicRemove(otherEnd, msgs);
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				return basicSetElectiveCourses(null, msgs);
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				return basicSetObligatoryCourses(null, msgs);
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
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, StudyprogramPackage.DEPARTMENT__PROGRAMS, Department.class, msgs);
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
			case StudyprogramPackage.PROGRAM__NAME:
				return getName();
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				return getDepartment();
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				return getStudyPlans();
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				return getElectiveCourses();
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				return getObligatoryCourses();
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				getStudyPlans().clear();
				getStudyPlans().addAll((Collection<? extends StudyPlan>)newValue);
				return;
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				setElectiveCourses((ElectiveCourses)newValue);
				return;
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				setObligatoryCourses((ObligatoryCourses)newValue);
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				getStudyPlans().clear();
				return;
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				setElectiveCourses((ElectiveCourses)null);
				return;
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				setObligatoryCourses((ObligatoryCourses)null);
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
			case StudyprogramPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.PROGRAM__DEPARTMENT:
				return getDepartment() != null;
			case StudyprogramPackage.PROGRAM__STUDY_PLANS:
				return studyPlans != null && !studyPlans.isEmpty();
			case StudyprogramPackage.PROGRAM__ELECTIVE_COURSES:
				return electiveCourses != null;
			case StudyprogramPackage.PROGRAM__OBLIGATORY_COURSES:
				return obligatoryCourses != null;
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

} //ProgramImpl
