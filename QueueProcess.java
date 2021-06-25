package Queue;

public class QueueProcess implements IQueueProcess {
    
    private Node firstPerson, lastPerson;

    public class Node {
        public Person person;
        public Node nextPerson;

        public Node(Person person) {
            this.person = person;
        }
    }
    
    @Override
    public void offer(Person p) {
        Node node = new Node(p);
        if (firstPerson == null) {
            firstPerson = node;
        } else {
            lastPerson.nextPerson = node;
        }
        lastPerson = node;
    }

    @Override
    public void remove() {
        if (firstPerson != null) {
            Node personToRemove = firstPerson;
            firstPerson = firstPerson.nextPerson;
            personToRemove.nextPerson = null;
            if (firstPerson == null) {
                lastPerson = null;
            }
        }
    }

    @Override
    public Person peek() {
        if (firstPerson == null) {
            return null;
        } else {
            return firstPerson.person;
        }
    }
}