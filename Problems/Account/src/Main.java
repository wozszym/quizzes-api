class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean x) {
        locked = x;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}