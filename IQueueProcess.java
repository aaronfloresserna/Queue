/*
Author: Aaron Flores
Date: June, 24 2021
*/
package Queue;

public interface IQueueProcess {

    public void offer(Person p);

    public void remove();

    public Person peek();

}