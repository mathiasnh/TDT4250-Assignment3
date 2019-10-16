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

import studyprogram.Course;
import studyprogram.Department;
import studyprogram.Program;
import studyprogram.StudyprogramPackage;
import studyprogram.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.DepartmentImpl#getSchool <em>School</em>}</li>
 *   <li>{@link studyprogram.impl.DepartmentImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprogram.impl.DepartmentImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
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
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.DEPARTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University getSchool() {
		if (eContainerFeatureID() != StudyprogramPackage.DEPARTMENT__SCHOOL) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(University newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, StudyprogramPackage.DEPARTMENT__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(University newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != StudyprogramPackage.DEPARTMENT__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, StudyprogramPackage.UNIVERSITY__DEPARTMENTS, University.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.DEPARTMENT__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<Course>(Course.class, this, StudyprogramPackage.DEPARTMENT__COURSES, StudyprogramPackage.COURSE__DEPARTMENT);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentWithInverseEList<Program>(Program.class, this, StudyprogramPackage.DEPARTMENT__PROGRAMS, StudyprogramPackage.PROGRAM__DEPARTMENT);
		}
		return programs;
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
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((University)otherEnd, msgs);
			case StudyprogramPackage.DEPARTMENT__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrograms()).basicAdd(otherEnd, msgs);
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
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				return basicSetSchool(null, msgs);
			case StudyprogramPackage.DEPARTMENT__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
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
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				return eInternalContainer().eInverseRemove(this, StudyprogramPackage.UNIVERSITY__DEPARTMENTS, University.class, msgs);
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
			case StudyprogramPackage.DEPARTMENT__NAME:
				return getName();
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				return getSchool();
			case StudyprogramPackage.DEPARTMENT__COURSES:
				return getCourses();
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				return getPrograms();
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
			case StudyprogramPackage.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				setSchool((University)newValue);
				return;
			case StudyprogramPackage.DEPARTMENT__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends Program>)newValue);
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
			case StudyprogramPackage.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				setSchool((University)null);
				return;
			case StudyprogramPackage.DEPARTMENT__COURSES:
				getCourses().clear();
				return;
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				getPrograms().clear();
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
			case StudyprogramPackage.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.DEPARTMENT__SCHOOL:
				return getSchool() != null;
			case StudyprogramPackage.DEPARTMENT__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyprogramPackage.DEPARTMENT__PROGRAMS:
				return programs != null && !programs.isEmpty();
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

} //DepartmentImpl
