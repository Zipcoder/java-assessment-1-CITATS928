package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    List<Pet> pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        if(pets!=null) {
            this.pets = new ArrayList<>(Arrays.asList(pets));
        }else{
            this.pets=new ArrayList<>();
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pets.get(0));
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
    return this.pets.contains(pet);

        //return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int num = 500000;
        for(Pet pet:pets){
            if(pet.getAge()<num){
                num = pet.getAge();
            }
        }
        return num;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int num =0;
        for(Pet pet:pets){
            if (pet.getAge()>num){
                num = pet.getAge();
            }
        }
        return num;
        //return null;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int num =0;
        for(Pet pet:pets){
            num+=pet.getAge();
        }
        float result = (float) num/pets.size();
        return result;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets.toArray(new Pet[0]);
    }
}
