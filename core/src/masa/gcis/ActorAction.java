package masa.gcis;


public interface ActorAction<T,K> {
    public void commenceOperation(T me, K him);
}
