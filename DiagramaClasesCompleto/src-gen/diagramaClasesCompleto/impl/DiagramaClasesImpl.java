/**
 */
package diagramaClasesCompleto.impl;

import diagramaClasesCompleto.Artefacto;
import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.ConfiguracionLenguaje;
import diagramaClasesCompleto.ConfiguracionMicroservicios;
import diagramaClasesCompleto.DiagramaClases;
import diagramaClasesCompleto.DiagramaClasesCompletoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getPackages_contenidos <em>Packages contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getArtefacto_contenido <em>Artefacto contenido</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguraciondb <em>Configuraciondb</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguraciondocker <em>Configuraciondocker</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguracionlenguaje <em>Configuracionlenguaje</em>}</li>
 *   <li>{@link diagramaClasesCompleto.impl.DiagramaClasesImpl#getConfiguracionmicroservicios <em>Configuracionmicroservicios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaClasesImpl extends MinimalEObjectImpl.Container implements DiagramaClases {
	/**
	 * The cached value of the '{@link #getPackages_contenidos() <em>Packages contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<diagramaClasesCompleto.Package> packages_contenidos;

	/**
	 * The cached value of the '{@link #getArtefacto_contenido() <em>Artefacto contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefacto_contenido()
	 * @generated
	 * @ordered
	 */
	protected Artefacto artefacto_contenido;

	/**
	 * The cached value of the '{@link #getConfiguraciondb() <em>Configuraciondb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguraciondb()
	 * @generated
	 * @ordered
	 */
	protected ConfiguracionDB configuraciondb;

	/**
	 * The cached value of the '{@link #getConfiguraciondocker() <em>Configuraciondocker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguraciondocker()
	 * @generated
	 * @ordered
	 */
	protected ConfiguracionDocker configuraciondocker;

	/**
	 * The cached value of the '{@link #getConfiguracionlenguaje() <em>Configuracionlenguaje</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguracionlenguaje()
	 * @generated
	 * @ordered
	 */
	protected ConfiguracionLenguaje configuracionlenguaje;

	/**
	 * The cached value of the '{@link #getConfiguracionmicroservicios() <em>Configuracionmicroservicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguracionmicroservicios()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguracionMicroservicios> configuracionmicroservicios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramaClasesCompletoPackage.Literals.DIAGRAMA_CLASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<diagramaClasesCompleto.Package> getPackages_contenidos() {
		if (packages_contenidos == null) {
			packages_contenidos = new EObjectContainmentEList<diagramaClasesCompleto.Package>(
					diagramaClasesCompleto.Package.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS);
		}
		return packages_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artefacto getArtefacto_contenido() {
		return artefacto_contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtefacto_contenido(Artefacto newArtefacto_contenido, NotificationChain msgs) {
		Artefacto oldArtefacto_contenido = artefacto_contenido;
		artefacto_contenido = newArtefacto_contenido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO, oldArtefacto_contenido,
					newArtefacto_contenido);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtefacto_contenido(Artefacto newArtefacto_contenido) {
		if (newArtefacto_contenido != artefacto_contenido) {
			NotificationChain msgs = null;
			if (artefacto_contenido != null)
				msgs = ((InternalEObject) artefacto_contenido).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO,
						null, msgs);
			if (newArtefacto_contenido != null)
				msgs = ((InternalEObject) newArtefacto_contenido).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO,
						null, msgs);
			msgs = basicSetArtefacto_contenido(newArtefacto_contenido, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO, newArtefacto_contenido,
					newArtefacto_contenido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionDB getConfiguraciondb() {
		return configuraciondb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguraciondb(ConfiguracionDB newConfiguraciondb, NotificationChain msgs) {
		ConfiguracionDB oldConfiguraciondb = configuraciondb;
		configuraciondb = newConfiguraciondb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB, oldConfiguraciondb,
					newConfiguraciondb);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguraciondb(ConfiguracionDB newConfiguraciondb) {
		if (newConfiguraciondb != configuraciondb) {
			NotificationChain msgs = null;
			if (configuraciondb != null)
				msgs = ((InternalEObject) configuraciondb).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB, null,
						msgs);
			if (newConfiguraciondb != null)
				msgs = ((InternalEObject) newConfiguraciondb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB, null,
						msgs);
			msgs = basicSetConfiguraciondb(newConfiguraciondb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB, newConfiguraciondb,
					newConfiguraciondb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionDocker getConfiguraciondocker() {
		return configuraciondocker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguraciondocker(ConfiguracionDocker newConfiguraciondocker,
			NotificationChain msgs) {
		ConfiguracionDocker oldConfiguraciondocker = configuraciondocker;
		configuraciondocker = newConfiguraciondocker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER, oldConfiguraciondocker,
					newConfiguraciondocker);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguraciondocker(ConfiguracionDocker newConfiguraciondocker) {
		if (newConfiguraciondocker != configuraciondocker) {
			NotificationChain msgs = null;
			if (configuraciondocker != null)
				msgs = ((InternalEObject) configuraciondocker).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER,
						null, msgs);
			if (newConfiguraciondocker != null)
				msgs = ((InternalEObject) newConfiguraciondocker).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER,
						null, msgs);
			msgs = basicSetConfiguraciondocker(newConfiguraciondocker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER, newConfiguraciondocker,
					newConfiguraciondocker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfiguracionLenguaje getConfiguracionlenguaje() {
		return configuracionlenguaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguracionlenguaje(ConfiguracionLenguaje newConfiguracionlenguaje,
			NotificationChain msgs) {
		ConfiguracionLenguaje oldConfiguracionlenguaje = configuracionlenguaje;
		configuracionlenguaje = newConfiguracionlenguaje;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE, oldConfiguracionlenguaje,
					newConfiguracionlenguaje);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguracionlenguaje(ConfiguracionLenguaje newConfiguracionlenguaje) {
		if (newConfiguracionlenguaje != configuracionlenguaje) {
			NotificationChain msgs = null;
			if (configuracionlenguaje != null)
				msgs = ((InternalEObject) configuracionlenguaje).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE,
						null, msgs);
			if (newConfiguracionlenguaje != null)
				msgs = ((InternalEObject) newConfiguracionlenguaje).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE,
						null, msgs);
			msgs = basicSetConfiguracionlenguaje(newConfiguracionlenguaje, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE, newConfiguracionlenguaje,
					newConfiguracionlenguaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfiguracionMicroservicios> getConfiguracionmicroservicios() {
		if (configuracionmicroservicios == null) {
			configuracionmicroservicios = new EObjectContainmentEList<ConfiguracionMicroservicios>(
					ConfiguracionMicroservicios.class, this,
					DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS);
		}
		return configuracionmicroservicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return ((InternalEList<?>) getPackages_contenidos()).basicRemove(otherEnd, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return basicSetArtefacto_contenido(null, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return basicSetConfiguraciondb(null, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return basicSetConfiguraciondocker(null, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return basicSetConfiguracionlenguaje(null, msgs);
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return ((InternalEList<?>) getConfiguracionmicroservicios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return getPackages_contenidos();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return getArtefacto_contenido();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return getConfiguraciondb();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return getConfiguraciondocker();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return getConfiguracionlenguaje();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return getConfiguracionmicroservicios();
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
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			getPackages_contenidos().clear();
			getPackages_contenidos().addAll((Collection<? extends diagramaClasesCompleto.Package>) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			setArtefacto_contenido((Artefacto) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			setConfiguraciondb((ConfiguracionDB) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			setConfiguraciondocker((ConfiguracionDocker) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			setConfiguracionlenguaje((ConfiguracionLenguaje) newValue);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			getConfiguracionmicroservicios().clear();
			getConfiguracionmicroservicios().addAll((Collection<? extends ConfiguracionMicroservicios>) newValue);
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
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			getPackages_contenidos().clear();
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			setArtefacto_contenido((Artefacto) null);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			setConfiguraciondb((ConfiguracionDB) null);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			setConfiguraciondocker((ConfiguracionDocker) null);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			setConfiguracionlenguaje((ConfiguracionLenguaje) null);
			return;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			getConfiguracionmicroservicios().clear();
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
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__PACKAGES_CONTENIDOS:
			return packages_contenidos != null && !packages_contenidos.isEmpty();
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__ARTEFACTO_CONTENIDO:
			return artefacto_contenido != null;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDB:
			return configuraciondb != null;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONDOCKER:
			return configuraciondocker != null;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONLENGUAJE:
			return configuracionlenguaje != null;
		case DiagramaClasesCompletoPackage.DIAGRAMA_CLASES__CONFIGURACIONMICROSERVICIOS:
			return configuracionmicroservicios != null && !configuracionmicroservicios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaClasesImpl
