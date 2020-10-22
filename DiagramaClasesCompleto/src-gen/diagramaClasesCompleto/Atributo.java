/**
 */
package diagramaClasesCompleto;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Atributo#isEsAuditable <em>Es Auditable</em>}</li>
 *   <li>{@link diagramaClasesCompleto.Atributo#getPseudonimo <em>Pseudonimo</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends Retornable {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link diagramaClasesCompleto.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getAtributo_Tipo()
	 * @model default="int"
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see diagramaClasesCompleto.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Es Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Auditable</em>' attribute.
	 * @see #setEsAuditable(boolean)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getAtributo_EsAuditable()
	 * @model
	 * @generated
	 */
	boolean isEsAuditable();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Atributo#isEsAuditable <em>Es Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Auditable</em>' attribute.
	 * @see #isEsAuditable()
	 * @generated
	 */
	void setEsAuditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Pseudonimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudonimo</em>' attribute.
	 * @see #setPseudonimo(String)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getAtributo_Pseudonimo()
	 * @model
	 * @generated
	 */
	String getPseudonimo();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.Atributo#getPseudonimo <em>Pseudonimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudonimo</em>' attribute.
	 * @see #getPseudonimo()
	 * @generated
	 */
	void setPseudonimo(String value);

} // Atributo
