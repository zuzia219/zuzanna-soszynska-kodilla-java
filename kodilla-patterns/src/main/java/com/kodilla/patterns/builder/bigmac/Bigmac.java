package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingridients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingridients = new ArrayList<>();
        private List<String> availableIngriedients;
        private List<String> availableRolls;
        private List<String> availableSauces;
        private int maxNumberOfBurgers;

        public BigmacBuilder(List<String> availableIngriedients, List<String> availableRolls, List<String> availableSauces, int maxNumberOfBurgers) {
            this.availableIngriedients = availableIngriedients;
            this.availableRolls = availableRolls;
            this.availableSauces = availableSauces;
            this.maxNumberOfBurgers = maxNumberOfBurgers;
        }


        public BigmacBuilder roll(String roll) {
            if (availableRolls.contains(roll)) {
                this.roll = roll;
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) throws ToManyBurgersBigmacMayCollapseException {
            if (burgers <= maxNumberOfBurgers) {
                this.burgers = burgers;
            } else {
                throw new ToManyBurgersBigmacMayCollapseException();
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) throws SauceNotAvailableException {
            if (availableSauces.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new SauceNotAvailableException();
            }
            return this;
        }

        public BigmacBuilder ingridient(String ingridient) throws RollNotAvailableException {
            if (availableIngriedients.contains(ingridient)) {
                ingridients.add(ingridient);
            } else {
                throw new RollNotAvailableException();
            }
            return this;

        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingridients);
        }

    }

    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingridients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingridients = new ArrayList<>(ingridients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngridients() {
        return ingridients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }
}


