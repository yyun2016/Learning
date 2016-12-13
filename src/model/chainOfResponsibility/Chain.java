package model.chainOfResponsibility;


/**
 *  The interface of the chain
 *  You can use AddChain function to modify the chain dynamically
 *  责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
 *  请求在这条链上传递，直到某一对象决定处理该请求。但是发 出者并不清楚到底最终那个对象会处理该请求，
 *  所以，责任链模式可以实现，在隐瞒客户端的情况下，
 *  对系统进行动态的调整
 */
public interface Chain  {
    public abstract void addChain(Chain c);
    public abstract void sendToChain(String mesg);
    public abstract Chain getChain();
}