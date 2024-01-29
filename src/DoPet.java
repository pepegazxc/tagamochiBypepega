import java.util.Scanner;

    public class DoPet {
        private int Doeating;
        private int Dodrinking;
        private int DoSleeping;
        private int DoShower;
        private int DoHealing;
        private boolean life = true;

        public DoPet(int theNeedForFood, int theNeedForWater, int theNeedForSleep, int theNeedForHygiene, int theNeedForTreatment) {
            this.Doeating = theNeedForFood;
            this.Dodrinking = theNeedForWater;
            this.DoSleeping= theNeedForSleep;
            this.DoShower = theNeedForHygiene;
            this.DoHealing = theNeedForTreatment;
            this.life = true;
        }

        public boolean isLife() {
            return life;
        }

        public int getDoeating() {
            return Doeating;
        }

        public void setDoeating(int editNeed) {
            if (Doeating + editNeed > 100) {
                life = false;
                System.out.println("Вы очень щедрых хозяин! На столько щедрый , что от колличества еды вашему питомцу разорвало желудок и он умер.");
                System.out.println("R.I.P.");
            } else if (Doeating + editNeed < 0) {
                life = false;
                System.out.println("Очень надеюсь, что в честь вашего питомца назовут эту марку корма ведь именно он узнал, какова его смертельная доза .");
                System.out.println("PRESS F TO PAY RESPECT");
            } else {
                Doeating = Doeating + editNeed;
            }
        }

        public int getDodrinking() {
            return Dodrinking;
        }

        public void setDodrinking(int editNeed) {
            if (Dodrinking + editNeed > 100) {
                life = false;
                System.out.println("Во время питья на вашем питомце начали образовываться дырки...Ну...Теперь у вас есть новый друшлак!.");
                System.out.println("R.I.P.");
            } else if (Dodrinking + editNeed < 0) {
                life = false;
                System.out.println("Пока ваш питомец пил, он познал истинную сущность воды...На столько сильно ее познал, что захлебнулся в миске.");
                System.out.println("R.I.P.");
            } else {
                Dodrinking = Dodrinking + editNeed;
            }
        }

        public int getDoSleeping() {
            return DoSleeping;
        }

        public void setDoSleeping(int editNeed) {
            if (DoSleeping + editNeed > 100) {
                System.out.println("Питомец не хочет спать.");
            } else if (DoSleeping + editNeed < 0) {
                life = false;
                System.out.println("Походу у вашего питомца были проблемы с сердцем...Теперь у него нет проблем с сердцем, а у вас питомца!");
                System.out.println("R.I.P.");
            } else {
                DoSleeping = DoSleeping + editNeed;
            }
        }

        public int getDoShower() {
            return DoSleeping;
        }

        public void setDoShower(int editNeed) {
            if (DoSleeping + editNeed > 100) {
                life = false;
                System.out.println("Вы так долго мыли вашего питомца, что он начал блестеть как золото!..В последствие его украли цыганы.");
                System.out.println("R.I.P.");
            } else if (DoSleeping + editNeed < 0) {
                life = false;
                System.out.println("Из-за несоблюдения санитарных норм в вашем питомце завелись новые формы жизни, которые будут страшнее челябенских мух...");
                System.out.println("R.I.P.");
            } else {
                DoShower = DoShower + editNeed;
            }
        }

        public int getDoHealing() {
            return DoHealing;
        }

        public void setDoHealing(int editNeed) {
            if (DoHealing + editNeed > 100) {
                life = false;
                System.out.println("Ваш питомец помер...Теперь вы знаете какой гематоген брать точно не стоит.");
                System.out.println("R.I.P.");
            } else if (DoHealing + editNeed < 0) {
                life = false;
                System.out.println("В последнее время ваш питомец выглядил неважно...Возможно эта была болезнь, а не эффект от похмелья.");
                System.out.println("R.I.P.");
            } else {
                DoHealing = DoHealing + editNeed;
            }
        }

        public void squanderTime() {
            setDoeating(-10);
            setDodrinking(-20);
            setDoSleeping(-5);
            setDoShower(-15);
            setDoHealing(-5);
        }

        public void printlnCharacteristics() {
            System.out.println("Голод: " + Doeating);
            System.out.println("Жажда: " + Dodrinking);
            System.out.println("Сонливость: " + DoSleeping);
            System.out.println("Гигиена: " + DoShower);
            System.out.println("Здоровье: " + DoHealing);
        }

        public void printlnMenu() {
            System.out.println("-".repeat(15));
            System.out.println("1. Покормить");
            System.out.println("2. Попоить");
            System.out.println("3. Уложить спать");
            System.out.println("4. Помыть");
            System.out.println("5. Полечить");
            System.out.println("6. Ждать");
            System.out.println("0. Выйти из игры");
        }

        static int inputInt(String message, int min, int max) {
            boolean isValidInput;
            int output = 0;
            do {
                try {
                    isValidInput = true;
                    Scanner scanner = new Scanner (System.in);

                    System.out.print(message);
                    output = scanner.nextInt();

                    if (output < min || output > max) {
                        System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                        throw new Exception();
                    }

                } catch (Exception e) {
                    isValidInput = false;
                    System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
                }

            } while (isValidInput == false);

            return output;
        }
    }

