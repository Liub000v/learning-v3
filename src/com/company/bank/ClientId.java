package com.company.bank;

public class ClientId {
    final String name;
    final String surname;

    public ClientId(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientId)) return false;

        ClientId clientId = (ClientId) o;

        if (!name.equals(clientId.name)) return false;
        return surname.equals(clientId.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }
}
