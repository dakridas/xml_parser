// Dimitris Akridas d.akridas@gmail.com
// Aristotelis Koligliatis aris.Koligliatis@gmail.com
import java.lang.Object;
import java.util.LinkedList;

public class Document extends Object{

	private Node rootNode;
	private LinkedList <Namespace> namespaces;

    public Document() {
		namespaces = new LinkedList <Namespace>();
	}

	public Document(Node rootNode) {
		namespaces = new LinkedList <Namespace>();
		this.rootNode = rootNode;
	}

	public Node getRootNode() {
		return rootNode;
	}

	protected void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	protected void addNamespace(Namespace namespace) {
		namespaces.add(namespace);
	}

	public boolean namespacePrefixExists(String prefix) {
		for(int i = 0; i < namespaces.size(); i++) {
            // if prefix exists return true
			if (prefix.equals((namespaces.get(i)).getPrefix())) {
				return true;
			}
		}
		return false;
	}

    public LinkedList<Namespace> getNamespaces() {
        return namespaces;
    }

	public Namespace getNamespace(String prefix) {
		LinkedList <Namespace> temp;
		for(int i = 0; i < namespaces.size(); i++) {
            // if prefix exists return namespace
			if (prefix.equals((namespaces.get(i)).getPrefix())) {
				return namespaces.get(i);
			}
		}
		return null;
	}

	public String toXMLString() {
        String str = new String();
        str = str + "\n" + rootNode.toXMLString(0);
		return (str);
	}
}
