package cpath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Stellt ein Projekt dar, das aus Arbeitspaketen besteht. Im Prinzip nichts
 * anderes als ein Graph mit Arbeitspaketen als Knoten. Das Projekt kennt nur
 * die Startknoten, diese kennen jeweils ihren Nachfolger.
 */
public class Project {

	private List<Workpackage> startNodes = new ArrayList<Workpackage>();
	private List<Workpackage> endNodes = new ArrayList<Workpackage>();
	private Set<Workpackage> criticalPathNodes = new HashSet<Workpackage>();
	private Set<Workpackage> allNodes = new HashSet<Workpackage>();
	private Stack<Workpackage> currentNodes = new Stack<Workpackage>();

	public List<Workpackage> getStartNodes() {
		return startNodes;
	}

	public void setStartNodes(List<Workpackage> startNodes) {
		this.startNodes = startNodes;
	}

	public Set<Workpackage> getCriticalPathNodes() {
		return criticalPathNodes;
	}

	public Set<Workpackage> getAllNodes() {
		return allNodes;
	}

	public void computeCriticalPath() {
		resetLists();
		// TODO: Implementieren Sie diese Methode, so dass nach deren Aufruf
		// alle Werte im Graph gesetzt sind und die beiden verfuegbaren Sets
		// korrekt befuellt wurden. Veraendern Sie nicht die Workpackage-Klasse!
		// Zum Testen koennen Sie die beigefuegte Test-Klasse verwenden und
		// erweitern. Beachten Sie, dass ihre Implementierung generell
		// funktionieren und nicht nur dieses eine Problem loesen soll.
	}

	private void resetLists() {
		currentNodes.clear();
		endNodes.clear();
		criticalPathNodes.clear();
		allNodes.clear();
	}
}
