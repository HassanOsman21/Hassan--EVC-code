


//Hassan Osman Hussein
//ID:C6230128

import java.util.Scanner;

public class EVC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pinka_saxda = "2324";
        double haraageyga = 40.00;

        int reference = 7571577;

        int account = 80076600;

        int account_sirta = 160825;

        double akoonka_haraageyga = 900;
        String phone_number = "252616352416";

        System.out.print("Fadlan geli *770#: ");

        String geli = input.nextLine();

        if (!geli.equals("*770#")) {
            System.out.println("\nsorr the operation filed...");
        } else {
            System.out.println("\n-EVCPLUS-");

            System.out.print("Fadlan geli PIN-kaaga (Enter PIN): ");

            String userpinka = input.nextLine();


            if (!userpinka.equals(pinka_saxda)) {
                System.out.println("\n[-EVCPLUS-] Nambarka Sirta ah waa Khalad");
            } else {
                System.out.println("\nEVCPlus");
                System.out.println("1. Itus Haraaga");
                System.out.println("2. Kaarka hadalka");
                System.out.println("3. Bixi Biil");
                System.out.println("4. U wareeji EVCPlus");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8.Taaj");
                System.out.println("9. Bill Payment");

                int doorasho = input.nextInt();

                if (doorasho < 1 || doorasho > 9) {
                    System.out.println("fadlan soo geli number sax ah ");
                }

                switch (doorasho) {
                    case 1:
                        //1.haragaga itus

                        showBalance(haraageyga);
                        break;

                        case 2:
                            //  karka hadalka

                            System.out.println("\nKaarka hadalka");
                            System.out.println("1. Ku Shubo Airtime");
                            System.out.println("2. Ugu Shub Airtime");
                            System.out.println("3. MIFI Packages");
                            System.out.println("4. Ku shubo Internet");
                            System.out.println("5. Ugu shub qof kale (MMT)");
                            System.out.print("Dooro : ");
                            int dorasho_karka_hadalka = input.nextInt();

                            if (dorasho_karka_hadalka < 1 || dorasho_karka_hadalka > 5) {
                                System.out.println("fadlan soo geli number sax ah ");
                                break;
                            }
                            switch (dorasho_karka_hadalka) {
                                case 1:
                                    //Ku Shubo Airtime
                                    System.out.print("\nFadlan Geli lacagta: $");
                                    double amount1 = input.nextDouble();
                                    input.nextLine();

                                    System.out.println("\nМа hubtaa inaad $" + amount1 + " ugu shubtid " + phone_number + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    System.out.print("Dooro   : ");
                                    int xaqijin = input.nextInt();

                                    if (xaqijin == 1) {
                                        if (amount1 > haraageyga) {
                                            System.out.println("\nHaraaga xisaabtaadu kuguma filna, mobile No: " + phone_number);
                                        } else {
                                            haraageyga -= amount1;
                                            System.out.println("\nWaxaad ugu shubtay $" + amount1 + ", mobile No: " + phone_number);
                                            System.out.println("Haraagaaga cusub waa $" + haraageyga);
                                        }
                                    } else {
                                        System.out.println("\nMahadsanid!");
                                    }
                                    break;

                                case 2:
                                    //Ugu Shub Airtime
                                    System.out.print("\nFadlan Gali Mobile-ka: ");
                                    int mobile_qofka = input.nextInt();

                                    System.out.print("Fadlan Geli lacagta: $");
                                    double amount2 = input.nextDouble();


                                    System.out.println("\nMa hubtaa inaad $" + amount2 + " ugu shubto number-kan " + mobile_qofka + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    System.out.print("Dooro: ");
                                    int xaqiijin = input.nextInt();

                                    if (xaqiijin == 1) {
                                        if (amount2 > haraageyga) {
                                            System.out.println("\nHaraaga xisaabtaadu kuguma filna, mobile No: " + mobile_qofka);
                                        } else {
                                            haraageyga -= amount2;
                                            System.out.println("\nWaxaad $" + amount2 + " ugu shubtay mobile No: " + mobile_qofka);
                                            System.out.println("Haraagaaga cusub waa $" + haraageyga);
                                        }
                                    } else if (xaqiijin == 2) {
                                        System.out.println("\n Mahadsanid!");
                                    } else {
                                        System.out.println("\nFadlan dooro lambarka saxda ah .");
                                    }

                                    break;
                                // MIFI Packages
                                case 3:
                                    System.out.println("1.Ku Shubo Data-da MIFI");
                                    int data_mifi = input.nextInt();
                                    if (data_mifi != 1) {
                                        System.out.println("dooro number sax ah");
                                        break;
                                    }

                                    System.out.println("--Internet Bundle Recharge");
                                    System.out.println("1. isbuucle (Weekly)");
                                    System.out.println("2. Maalinle (Daily)");
                                    System.out.println("3. Bille (MiFi)");

                                    int doorodata = 0;

                                    while (true) {
                                        doorodata = input.nextInt();
                                        if (doorodata >= 1 && doorodata <= 3) {
                                            break;
                                        } else {
                                            System.out.println("Fadlan soo geli number sax ah");
                                        }
                                    }
                                    // isbuucle

                                    if (doorodata == 1) {
                                        String[] weekly = {"$5 = 10 GB", "$10 = 25 GB"};

                                        double[] lacagaha = {5.0, 10.0};

                                        System.out.println("\nFadlan dooro bundle ka:");
                                        for (int i = 0; i < weekly.length; i++) {
                                            System.out.println((i + 1) + ". " + weekly[i]);
                                        }

                                        System.out.print("Dooro : ");
                                        int dorobundleka = input.nextInt();
                                        if (dorobundleka == 1 || dorobundleka == 2) {
                                            System.out.print("\nFadlan Gali MIFI user: ");
                                            int mifiUser = input.nextInt();
                                            double bundleLacag = lacagaha[dorobundleka - 1];

                                            System.out.println("\nМа hubtaa inaad $" + bundleLacag + " ugu shubtid " + mifiUser + "?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            System.out.print("Dooro  ");
                                            int xqijin = input.nextInt();

                                            if (xqijin == 1) {
                                                if (bundleLacag > haraageyga) {
                                                    System.out.println("Haraagaagu kuma filna: " + phone_number);
                                                } else {
                                                    haraageyga -= bundleLacag;
                                                    System.out.println("\nWaxaad $" + bundleLacag + " ugu shubtay user mifi " + mifiUser +
                                                            "\n - Haraagaaga cusub waa $ " + haraageyga);
                                                }
                                            } else {
                                                System.out.println("\nMahadsanid!");
                                            }
                                        } else {
                                            System.out.println("\n dooro number sax ah.");
                                        }

                                        // maalinle

                                    } else if (doorodata == 2) {
                                        // Daily
                                        String[] malinle = {"$1 = 2 GB", "$2 = 5 GB"};
                                        double[] prices = {1.0, 2.0};

                                        System.out.println("\nFadlan dooro bundle ka:");
                                        for (int i = 0; i < malinle.length; i++) {
                                            System.out.println((i + 1) + ". " + malinle[i]);
                                        }

                                        System.out.print("Dooro : ");
                                        int doorobundle2 = input.nextInt();

                                        if (doorobundle2 == 1 || doorobundle2 == 2) {
                                            input.nextLine();
                                            System.out.print("\nFadlan Gali MIFI user: ");
                                            String mifiUser = input.nextLine();

                                            double bundle_lacagta2 = (doorobundle2 == 1) ? 1.0 : 2.0;

                                            System.out.println("\nМа hubtaa inaad $" + bundle_lacagta2 + " ugu shubtid " + mifiUser + "?");
                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");
                                            System.out.print("Dooro : ");
                                            int xaqijinBundle2 = input.nextInt();

                                            if (xaqijinBundle2 == 1) {

                                                if (bundle_lacagta2 > haraageyga) {
                                                    System.out.println("\nHaraaga xisaabtaadu kuguma filna " + phone_number);
                                                } else {
                                                    haraageyga -= bundle_lacagta2;
                                                    System.out.println("Waxaad ugu shubtay  $" + bundle_lacagta2 + " user mifi " + mifiUser);
                                                }
                                            } else {
                                                System.out.println("\nMahadsanid!");
                                            }

                                        } else {
                                            System.out.println("\nDoorasho khaldan.");
                                        }

                                        //Bille

                                    } else if (doorodata == 3) {
                                        String[] bile = {
                                                "$20 = 40 GB",
                                                "$40 = 85 GB",
                                                "$60 = 150 GB",
                                                "$25 = Monthly Unlimit"
                                        };
                                        int[] prices = {20, 40, 60, 25};

                                        for (int i = 0; i < bile.length; i++) {
                                            System.out.println((i + 1) + ". " + bile[i]);
                                        }

                                        int bundleka = input.nextInt();
                                        if (bundleka >= 1 && bundleka <= 4) {
                                            input.nextLine();
                                            System.out.print("Fadlan geli MIFI user: ");

                                            String mifiUser = input.nextLine();
                                            int mifiNumber = Integer.parseInt(mifiUser);

                                            int amount = prices[bundleka - 1];

                                            if (haraageyga >= amount) {
                                                System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid user mifi " + mifiUser + "?");
                                                System.out.println("1. Haa \n 2. Maya");
                                                int hubin = input.nextInt();

                                                if (hubin == 1) {
                                                    if ((mifiUser.startsWith("061") || mifiUser.startsWith("61")) &&
                                                            (mifiUser.length() == 9 || mifiUser.length() == 10)) {
                                                        haraageyga -= amount;
                                                        System.out.println("Waxaad $" + amount + " ugu shubtay user mifi " + mifiUser +
                                                                "\n -Haraagaagu waa $" + haraageyga);
                                                    } else {
                                                        System.out.println("MIFI user sax ah geli!.");
                                                    }
                                                } else if (hubin == 2) {
                                                    System.out.println("Mahadsanid!.");
                                                } else {
                                                    System.out.println("Lambar sax ah geli.");
                                                }

                                            } else {
                                                System.out.println("Haraagaagu kuma filna.");
                                            }
                                        } else {
                                            System.out.println("Dooro number sax ah.");
                                        }
                                    }
                                    break;


                                case 4:
                                    // Ku shubo Internet

                                    haraageyga = kuShuboInternet(input, haraageyga, phone_number);
                                    break;


                                case 5:
                                    // Ugu shub qof kale (MMT)

                                    System.out.print("\nFadlan soo geli mobile-ka: ");
                                    String qofka_kale = input.nextLine();

                                    System.out.print("Fadlan soo geli lacagta: $");
                                    double lcgta_qofka = input.nextDouble();
                                    System.out.println("\nMa hubtaa inaad $" + lcgta_qofka + " ugu shubtid " + qofka_kale + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    System.out.print("Dooro : ");
                                    int hubin_dooro = input.nextInt();
                                    switch (hubin_dooro) {
                                        case 1:
                                            if (haraageyga >= lcgta_qofka) {
                                                haraageyga -= lcgta_qofka;
                                                System.out.println("\nWaad ku guuleysatay inaad $" + lcgta_qofka + " ugu shubtay " + qofka_kale);
                                                System.out.println("Haraagaaga cusub waa $" + haraageyga);
                                            } else {
                                                System.out.println("\nHaraagaagu kuguma filna.");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("\nOk, Mahadsanid!");
                                            break;
                                        default:
                                            System.out.println("\nDoorasho khaldan. Fadlan geli 1 ama 2.");
                                    }
                                    break;
                            }
                            break;

                        // bixi biil
                        case 3:
                            System.out.println("Bixi Biil");
                            System.out.println("1. Post Paid  ");
                            System.out.println("2.ku Iibso");
                            int bixibiil = input.nextInt();
                            switch (bixibiil) {
                                case 1:
                                    System.out.println("Post Paid");
                                    System.out.println("1. Ogow biil");
                                    System.out.println("2. Bixi biil");
                                    System.out.println("3.Ka Bixi Biil");

                                    int post_paid = input.nextInt();

                                    switch (post_paid) {
                                        case 1:
                                            System.out.println("haraagagu waa $" + haraageyga);
                                            break;
                                        case 2:
                                            System.out.println("Fadlan geli lacagta biil-ka");
                                            int biilka_lacagta = input.nextInt();
                                            System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + biilka_lacagta);
                                            System.out.println("1.haa ");
                                            System.out.println("2. maya");
                                            int ogow_bil = input.nextInt();
                                            if (ogow_bil < 1 && ogow_bil > 2)
                                                System.out.println("dooro numberka mesha ku qoran mid ka mid ah");
                                            switch (ogow_bil) {
                                                case 1:
                                                    if (haraageyga >= biilka_lacagta) {
                                                        System.out.println("waad ku guuleysay inaa bixiso biilka \n -haraagagu hada waa $" + (haraageyga - biilka_lacagta));

                                                    } else System.out.println("haragaagu kuma filno");
                                                    break;
                                                case 2:
                                                    System.out.println("ok");
                                                    break;
                                                default:
                                                    System.out.println("fadlan soo geli number sax ah");

                                            }
                                            break;

                                        case 3:
                                            System.out.println("fadlan soo geli mobile-ka");
                                            int mobile = input.nextInt();
                                            System.out.println("fadlan geli lacgta");
                                            int geli_lacag = input.nextInt();
                                            System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + geli_lacag + " oo laga rabo tell NO " + mobile);
                                            System.out.println("1.haa");
                                            System.out.println("2. maya");
                                            int ka_bixi_biil = input.nextInt();
                                            switch (ka_bixi_biil) {
                                                case 1:
                                                    if (haraageyga >= geli_lacag) {
                                                        System.out.println("waad ku guuleysay inaad bixiso lacagta \n haragaagu hada waa $" + (haraageyga - geli_lacag));

                                                    } else System.out.println("haragaagu kugu ma filno ");
                                                    break;
                                                case 2:
                                                    System.out.println("ok");
                                                    break;
                                                default:
                                                    System.out.println("fadlan soo geli number sax ah adigo mahadsan");

                                            }
                                            break;
                                        default:
                                            System.out.println("fadlan soo geli number sax ah");
                                    }

                                    break;
                                case 2:
                                    System.out.println("Fadlan geli agoonsiga ganacsiga");
                                    double aqoonsi = input.nextDouble();

                                    if (aqoonsi == 1) {
                                        System.out.println("Fadlan Gali Number ka");
                                        int number = input.nextInt();
                                        System.out.println("Fadlan Gali lacagta");
                                        double money = input.nextDouble();
                                        System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n" + "1.haa\n" + "2.maya");
                                        int ku_iibso = input.nextInt();
                                        switch (ku_iibso) {
                                            case 1:
                                                if (haraageyga >= money) {
                                                    System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + haraageyga);

                                                }
                                                break;
                                            case 2:
                                                System.out.println("Mahadsanid!");
                                                break;
                                            default:
                                                System.out.println("fadlan soo dooro number sax ah ");
                                        }

                                    } else System.out.println("aqoonsigaaga waa qalad");

                                    break;
                                default:
                                    System.out.println("fadlan soo geli number sax ah");
                            }


                            break;

                        // U wareeji Evcplus
                        case 4:
                            System.out.println("fadlan geli mobile-ka");
                            int phone = input.nextInt();
                            System.out.println("fadaln geli lacagta");
                            double uwareeji = input.nextDouble();

                            System.out.println("Ma hubtaa inaad $" + uwareeji + " u warejisid " + phone + " ?");
                            System.out.println("1. haa");
                            System.out.println("2. maya");
                            int hubin = input.nextInt();

                            switch (hubin) {
                                case 1:

                                    if (haraageyga >= uwareeji) {

                                        System.out.println(uwareeji + " $ ayaad uwareejisay " + phone +
                                                "\n haraagaga hada waa $" + (haraageyga - uwareeji));
                                    } else System.out.println("haraagagu kuma filno ");
                                    break;

                                case 2:
                                    System.out.println("mahadsanid");
                                    break;
                                default:
                                    System.out.println("number sax ah soo geli");

                            }


                            break;
                        //5.warbixin kooban
                        case 5:
                            int warbixin_kooban = 0;
                            System.out.println("Warbixin Kooban");
                            System.out.println("1. Last Action ");
                            System.out.println("2. Wareejintii u dambeysay");
                            System.out.println("3. Iibsashadii u dambeysay");
                            System.out.println("4. Last 3 Action");
                            System.out.println("5. Email Me My Activity");
                            System.out.print("Fadlan dooro number : ");
                            warbixin_kooban = input.nextInt();

                            if (warbixin_kooban < 1 || warbixin_kooban > 5) {
                                System.out.println("Fadlan dooro numberka mesha ku qoran mid ka mid ah .");
                                break;


                            }

                            switch (warbixin_kooban) {
                                //1. Last Action
                                case 1:
                                    System.out.println("$10 Ayaad u wareejisay +252615550277, Taariikh: 20/06/25 14:13:30");
                                    break;
                                case 2:
                                    //2. Wareejintii u dambeysay

                                    System.out.println("Statementiga");
                                    System.out.println("1. U dirtay");
                                    System.out.println("2. Ka heshay");
                                    int statement = input.nextInt();

                                    if (statement == 1) {
                                        System.out.println("Fadlan geli mobile-ka:");
                                        int dirtay = input.nextInt();

                                        System.out.println("$10 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 29/08/23 10:08:15");
                                    } else if (statement == 2) {
                                        System.out.println("Fadlan geli mobile-ka:");
                                        int kaheshay = input.nextInt();
                                        System.out.println("$10 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 29/08/23 10:08:15");
                                    } else {
                                        System.out.println("Fadlan dooro number sax ah.");
                                    }
                                    break;

                                // 3. Iibsashadii u dambeysay
                                case 3:
                                    System.out.println("Iibsashadii u dambeysay lama heli karo hadda.");
                                    break;
                                // 4. Last 3 Action
                                case 4:
                                    System.out.println("$100 Ayaad u wareejisay +252615160825, Taariikh: 29/08/23 10:08:15");
                                    System.out.println("$90 Ayaad u wareejisay +252618800766, Taariikh:  10/08/23 19:08:15");
                                    System.out.println("$101 Ayaad u wareejisay +252617774339, Taariikh: 25/08/23 09:08:15");
                                    break;

                                // 5. Email Me My Activity

                                case 5:
                                    System.out.println("Your request is being processed and the activity will be emailed to hassanosman01@gmail.com.");
                                    break;
                            }
                            break;


                        //6.salam bank
                        case 6:
                            System.out.println("Salaam Bank");
                            System.out.println("1. Itus haraaga");
                            System.out.println("2. Lacag dhigasho");
                            System.out.println("3. Lacag qaadasho");
                            System.out.println("4. Ka wareeji EVCPlus");
                            System.out.println("5. Ka wareeji Account-kaga");
                            System.out.println("6. hubi wareeji account");
                            System.out.println("7. Maareynta Bankiga");
                            int salam_bank = input.nextInt();

                            if (salam_bank < 1 || salam_bank > 7) {
                                System.out.println("fadlan soo geli number sax ah");
                                break;
                            }

                            switch (salam_bank) {

                                // Itus haraaga

                                case 1:
                                    System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                    int num_sirta = input.nextInt();

                                    if (num_sirta == account_sirta) {
                                        System.out.println("haragaaga bangiga waa: " + akoonka_haraageyga + " USD");
                                    } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    break;

                                // Lacag dhigasho

                                case 2:
                                    System.out.println("fadlan geli lacagta");
                                    int lcg_dhigasho = input.nextInt();
                                    System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                    int number_sirt1 = input.nextInt();

                                    if (number_sirt1 == account_sirta) {
                                        System.out.println("Ma hubtaa inaad $" + lcg_dhigasho + " dhigatid account_kaaga bangiga? \n1. Haa \n2. Maya");
                                        int dhigasho_hubin = input.nextInt();

                                        if (dhigasho_hubin == 1) {
                                            System.out.println("USD " + lcg_dhigasho + " ayaa dhigatay koontadaada bangiga" +
                                                    "\n haragaagu hada waa: $" + (akoonka_haraageyga + lcg_dhigasho));
                                        } else if (dhigasho_hubin == 2) {
                                            System.out.println("ok");
                                        } else System.out.println("number sax ah soo geli");
                                    } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    break;

                                // Lacag qaadasho

                                case 3:
                                    System.out.println("fadlan geli lacagta");
                                    int lcg_qaadasho = input.nextInt();

                                    System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                    int num_sirt2 = input.nextInt();

                                    if (num_sirt2 == account_sirta) {
                                        System.out.println("Ma hubtaa inaad $" + lcg_qaadasho + " qaadatid account_kaaga bangiga? \n1. Haa \n2. Maya");
                                        int qaadasho_hubin = input.nextInt();

                                        if (qaadasho_hubin == 1) {
                                            if (akoonka_haraageyga >= lcg_qaadasho) {
                                                System.out.println("USD " + lcg_qaadasho + " ayaa kala baxday koontadaada bangiga" +
                                                        "\n haragaagu hda waa: $" + (akoonka_haraageyga - lcg_qaadasho));
                                            } else System.out.println("haragaagu kuma filno");
                                        } else if (qaadasho_hubin == 2) {
                                            System.out.println("ok");

                                        } else System.out.println("number sax ah soo geli");
                                    } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    break;

                                case 4:
                                    // 4. Ka wareeji EVCPlus

                                    System.out.println("fadlan soo dooro xisaabta bangiga");
                                    System.out.println("1. SALAAM SOMALI BANK");
                                    int salaam_dooro = input.nextInt();
                                    if (salaam_dooro == 1) {
                                        System.out.println("fadlan soo geli account-ka");
                                        int account_num = input.nextInt();
                                        System.out.println("fadlan geli macluumad");
                                        String macluumad = input.next();

                                        System.out.println("fadlan soo geli lacagta");
                                        double money = input.nextDouble();
                                        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                        int number_sirt3 = input.nextInt();

                                        if (number_sirt3 == account_sirta) {

                                            System.out.println("Ma hubtaa inaad u wareejiso account NO: " + account + " ? \n1. Haa \n2. Maya");
                                            int Dooro = input.nextInt();

                                            if (Dooro == 1) {
                                                if (akoonka_haraageyga >= money) {
                                                    System.out.println("waad ku guuleysay inaad dhigato $" + money + "ACCOUNT NO:" + account);
                                                } else System.out.println("haragaagu kuma filno");

                                            } else if (Dooro == 2) {
                                                System.out.println("mahadsanid!");
                                            } else System.out.println("fadlan soo geli number sax ah");
                                        } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    } else System.out.println("fadlan soo geli number sax ah");
                                    break;

                                case 5:
                                    // 5. Ka wareeji Account-kaga

                                    System.out.println("fadlan soo geli account ama mobile");
                                    int ko_onto = input.nextInt();

                                    System.out.println("fadlan soo geli lacagta");
                                    double Lacagta_1 = input.nextDouble();
                                    System.out.println("fadlan soo geli macluumad");
                                    String macluumad1 = input.next();

                                    System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                    int num_sirt_4 = input.nextInt();
                                    if (num_sirt_4 == account_sirta) {
                                        System.out.println("Ma hubtaa inaad u wareejiso $" + Lacagta_1 + " Bank Account NO: " + ko_onto + "? \n 1. Haa \n 2. Maya");
                                        int bixin = input.nextInt();

                                        if (bixin == 1) {
                                            System.out.println("waad ku guuleysay inaad u wareejiso lacagtan");
                                        } else if (bixin == 2) {
                                            System.out.println("mahadsanid!");
                                        } else System.out.println("fadlan soo geli number sax ah");
                                    } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    break;

                                // 6. hubi wareeji account

                                case 6:

                                    System.out.println("fadlan geli OTP");
                                    int otp = input.nextInt();
                                    System.out.println("Ma hubtaa in aad aqbasho lacagta diridan? \n1. Haa \n2. Maya");
                                    int otp_hubin = input.nextInt();
                                    if (otp_hubin == 1) {
                                        System.out.println("waad ku guuleysatay inaad ku dirto lacagta account to account");
                                    } else if (otp_hubin == 2) {
                                        System.out.println("mahadsanid!");
                                    } else System.out.println("fadlan soo geli number sax ah");
                                    break;

                                //  Maareynta Bankiga

                                case 7:

                                    System.out.println(" Maareynta Bankiga");
                                    System.out.println("1. Bedel PIN-ka Bangiga");
                                    System.out.println("2. Bedel Passwordka Ebank");
                                    int maareynta = input.nextInt();

                                    if (maareynta == 1) {
                                        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga: ");
                                        int number_sirt_5 = input.nextInt();
                                        System.out.println("Fadlan Geli pin-ka cusub ee bangiga: ");
                                        int number_sirt6 = input.nextInt();
                                        System.out.println("hubi pin-ka cusub: ");
                                        int num_sirt_7 = input.nextInt();
                                        if (number_sirt_5 == account_sirta) {
                                            if (number_sirt6 != number_sirt_5) {

                                                if (number_sirt6 == num_sirt_7) {
                                                    System.out.println("waad ku guuleysay inaad badasho pin-kaaga bangiga");
                                                } else
                                                    System.out.println("fadlan iska hubi pin-ka cusub");
                                            } else
                                                System.out.println("pin-ka cusub waa inuu ka duwan yahay kan hore");
                                        } else
                                            System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                    } else if (maareynta == 2) {
                                        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                        int number_sirta8 = input.nextInt();
                                        System.out.println("error occurred, please try again later");
                                    } else
                                        System.out.println("fadlan soo geli number sax ah");
                                    break;

                                default:
                                    System.out.println("fadlan soo geli number sax ah");
                            }
                            break;
                        // maareynta
                        case 7:
                            int Maareynta;

                            System.out.println("\nMaareynta");
                            System.out.println("1. Bedel Lambarka Sirta");
                            System.out.println("2. Bedel Luqadda");
                            System.out.println("3. Wargellin Mobile Lumay");
                            System.out.println("4. Lacag Xirasho");
                            System.out.println("5. U celli Lacag Qaldantay");
                            System.out.println("6. Enable Mobile Banking");
                            System.out.println("7. Ka bax");

                            Maareynta = input.nextInt();
                            if (Maareynta < 1 && Maareynta > 7) {
                                System.out.println("fadlan dooro number sax ah");
                                break;
                            }

                            switch (Maareynta) {

                                // Bedel Lambarka Sirta `
                                case 1:
                                    System.out.println("Fadlan Gelli PIN-Kaaga Cusub");
                                    int PINkaga_Cusub = input.nextInt();
                                    System.out.println("Hubi PIN-Kaaga Cusub");
                                    int Hubi_Cusub = input.nextInt();
                                    if (PINkaga_Cusub == Hubi_Cusub) {
                                        System.out.println("<-EVCPlus-> Waad Ku guuleysatay in aad badasho PIN-kaaga");
                                    } else {
                                        System.out.println("Kuma aadan Guleysan inaad badasho PIN-kaaga");
                                    }
                                    break;

                                // Bedel Luqadda

                                case 2:
                                    System.out.println("Fadlan Dooro luqada");
                                    System.out.println("1. English");
                                    System.out.println("2. Soomaali");
                                    int luqadda = input.nextInt();
                                    switch (luqadda) {
                                        case 1:
                                            System.out.println("<-EVCPlus-> You are successfully changed your language");
                                            break;
                                        case 2:
                                            System.out.println("<-EVCPlus-> Waad ku guuleysatey inaad badasho luqadda");
                                            break;
                                        default:
                                            System.out.println("Fadlan soo geli number sax ah");
                                    }
                                    break;

                                //Wargellin Mobile Lumay

                                case 3:
                                    System.out.println("Fadlan Geli Mobile-ka lumay");
                                    int mobile_lumay = input.nextInt();

                                    System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan " + mobile_lumay + "\n1. Haa\n2. Maya");
                                    int hubin_luumay = input.nextInt();
                                    switch (hubin_luumay) {
                                        case 1:
                                            System.out.println("Waad ku guuleysay inaad u diiwaan geliso mobile-lumay");
                                            break;
                                        case 2:
                                            System.out.println("OK");
                                            break;
                                        default:
                                            System.out.println("Fadlan soo geli number sax ah");
                                    }
                                    break;

                                //Lacag Xirasho

                                case 4:
                                    System.out.println("Fadlan Geli numberka khalad ah");
                                    int num_khalad = input.nextInt();
                                    System.out.println("Fadlan Geli numberkii loo rabay");
                                    int num_loo_rabay = input.nextInt();
                                    if (num_khalad == num_loo_rabay) {
                                        System.out.println("Ma hubtaa inaad xirto lacagtan? \n 1. Haa \n 2. Maya");
                                        int Lacag_Xirasho = input.nextInt();
                                        switch (Lacag_Xirasho) {
                                            case 1:
                                                System.out.println("Waad ku guuleysay inaad xirto lacagtaan");
                                                break;
                                            case 2:
                                                System.out.println("OK");
                                                break;
                                            default:
                                                System.out.println("Fadlan geli number sax ah");
                                        }
                                    } else {
                                        System.out.println("Dhaqdhaaqaan ma ahan mid jira");
                                    }
                                    break;

                                //U celli Lacag Qaldantay

                                case 5:
                                    System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                    int lacag_celis = input.nextInt();

                                    System.out.println("Ma hubtaa inaad celiso lacagtan? \n1. Haa \n2. Maya");
                                    int hubi_lacag_celis = input.nextInt();
                                    switch (hubi_lacag_celis) {
                                        case 1:
                                            System.out.println("Waad ku guuleysay inaad celiso lacagta");
                                            break;
                                        case 2:
                                            System.out.println("OK");
                                            break;
                                        default:
                                            System.out.println("Number sax ah soo geli");
                                    }
                                    break;

                                // Enable Mobile Banking

                                case 6:
                                    System.out.println("Fadlan geli number-ka is diiwaan gelinta");
                                    int is_diiwan = input.nextInt();
                                    System.out.println(is_diiwan + " Activation record was found");
                                    break;

                                //Ka bax

                                case 7:
                                    System.out.println("Waad ka baxday ");
                                    break;
                            }
                            //  taaj
                        case 8:

                            System.out.println("TAAJ\n" +
                                    "1. Gudaha\n" +
                                    "2. Dibadda\n" +
                                    "3. Ogoow Khidmada\n" +
                                    "4. Macluumadka xawaaladda\n" +
                                    "5. Jooji Xawaaladda\n" +
                                    "6. Fur Xawaaladda\n");
                            int Taaj = input.nextInt();
                            if (Taaj < 1 || Taaj > 6) {
                                System.out.println("Fadlan dooro number sax ah");
                            }
                            if (Taaj == 1) {
                                System.out.println("Fadlan dooro shirkada\n" +
                                        "1. E-KAAFI\n" +
                                        "2. E-SAHAL");

                                int shirkada = input.nextInt();
                                input.nextLine();
                                if (shirkada == 1) {
                                    System.out.println("Fadlan Geli Taleefanka qaataha");
                                    int talefanka = input.nextInt();
                                    input.nextLine();

                                    System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
                                    String FullName = input.nextLine();

                                    System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
                                    String magaalada = input.nextLine();

                                    System.out.println("Fadlan Geli lacagta");
                                    int lacagta = input.nextInt();
                                    System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                                    int confirm = input.nextInt();

                                    if (confirm == 1) {
                                        akoonka_haraageyga -= lacagta;
                                        if (akoonka_haraageyga < lacagta) {
                                            System.out.println("Haraagaagu kuguma filna");
                                        } else {
                                            System.out.println("Waxaad lacag $" + lacagta + " u dhigtay TAAJ " + FullName +
                                                    " oo joogo magaalada " + magaalada + "\n. Haraaga kontadan " + account +
                                                    " waa $" + akoonka_haraageyga);
                                        }
                                    } else {
                                        System.out.println(" Waad ka laabatay.");
                                    }
                                } else if (shirkada == 2) {
                                    System.out.println("Fadlan Geli Taleefanka qaataha");
                                    int talefanka = input.nextInt();
                                    input.nextLine();

                                    System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
                                    String FullName = input.nextLine();

                                    System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
                                    String magaalada = input.nextLine();

                                    System.out.println("Fadlan Geli lacagta");
                                    int lacagta = input.nextInt();
                                    System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                                    int confirm = input.nextInt();

                                    if (confirm == 1) {
                                        akoonka_haraageyga -= lacagta;
                                        if (akoonka_haraageyga < lacagta) {
                                            System.out.println("Haraagaagu kuguma filna");
                                        } else {
                                            System.out.println("Waxaad lacag $" + lacagta + " u dhigtay TAAJ " + FullName +
                                                    " oo joogo magaalada " + magaalada + ". Haraaga kontadan " + account +
                                                    " waa $" + akoonka_haraageyga);
                                        }
                                    } else {
                                        System.out.println("Lacag lama jarin. Waad ka laabatay.");
                                    }
                                }
                                break;
                            } else if (Taaj == 2) {
                                System.out.println("Fadlan Geli Taleefanka qaataha");
                                int talefanka = input.nextInt();
                                input.nextLine();
                                System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
                                String FullName = input.nextLine();
                                System.out.println("Fadlan Geli Magaalada qaataha uu joogo");

                                String magalada = input.nextLine();
                                System.out.println("Fadlan Geli Lacagta");
                                int lacag = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad");

                                lacag = input.nextInt();
                                System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa\n1.Haa \n2. Maya ");
                                int hubinka = input.nextInt();
                                if (hubinka == 1) {
                                    System.out.println("Ma hubtaa inaad $" + lacag + " u dirtid" + FullName + " oo wata taleefoonka " + talefanka + "?  \n1.Haa \n2. Maya ");
                                    hubinka = input.nextInt();
                                    if (hubinka == 1) {

                                        akoonka_haraageyga -= lacag;
                                        if (akoonka_haraageyga < lacag) {
                                            System.out.println("Haraagaagu kuguma filna");
                                        } else {
                                            System.out.println("waxaad $" + lacag + " u dirtay" + FullName + " oo wata taleefoonka " +
                                                    talefanka + " Haraagagu waa " + akoonka_haraageyga);
                                        }
                                    } else
                                        System.out.println("Mahadsanid!");

                                } else
                                    System.out.println("Mahadsanid!");

                                break;
                            } else if (Taaj == 3) {
                                System.out.println("Fadlan dooro shirkada\n" +
                                        "1. PAY TO EVCPLUS TMT\n" +
                                        "2. TAAJ\n" +
                                        "3. TaajPay\n" +
                                        "4. New Etaaj\n" +
                                        "5.TAAJ IPS");
                                int Ips = input.nextInt();
                                while (Ips < 1 || Ips > 5) {
                                    System.out.println("Fadlan dooro number sax ah");
                                    break;
                                }
                                System.out.println("Fadlan Geli Taleefanka qaataha");
                                int taleefanka = input.nextInt();
                                System.out.println("Fadlan Geli lacagta");
                                int lacagta = input.nextInt();
                                System.out.println("mahubtaa inaad $" + lacagta + " " + "u dirto tel No " + taleefanka);
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");

                                int hubinta = input.nextInt();
                                if (hubinta == 1) {
                                    akoonka_haraageyga -= lacagta;

                                    if (akoonka_haraageyga < lacagta) {
                                        System.out.println("Haraaga koontadan" + " " + account + " " + "kuma filna");
                                        break;
                                    }
                                    System.out.println("Waxaad $" + lacagta + " " + "u dirtay tell No " + " " + taleefanka +
                                            "haraagaagu waa" + akoonka_haraageyga);
                                } else {
                                    System.out.println("Mahadsanid");
                                    break;
                                }
                            } else if (Taaj == 4) {
                                System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                int aqoonsiga = input.nextInt();
                                int macluumad = 0;
                                while (macluumad != aqoonsiga) {
                                    System.out.println("Fadlan Geli Macluumaad");
                                    macluumad = input.nextInt();
                                    if (macluumad != aqoonsiga) {
                                        System.out.println("Invalid Input ");
                                        break;
                                    }
                                    if (macluumad == aqoonsiga) {
                                        System.out.println("Mahubtaa in aad xirto aqoonsiga xawilaada" + aqoonsiga + "?");

                                        System.out.println("1.Haa");
                                        System.out.println("1.Maya");

                                        int hubinn = input.nextInt();
                                        if (hubinn == 1) {
                                            System.out.println("Waxaad xirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    }
                                }
                                break;
                            } else if (Taaj == 5) {
                                System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                int aqoonsiga1 = input.nextInt();
                                int macluumad1 = 0;

                                while (macluumad1 != aqoonsiga1) {
                                    System.out.println("Fadlan Geli Macluumaad");

                                    macluumad1 = input.nextInt();
                                    if (macluumad1 != aqoonsiga1) {
                                        System.out.println("Invalid Input ");
                                    } else if (macluumad1 == aqoonsiga1) {

                                        System.out.println("Mahubtaa in aad xirto aqoonsiga xawilaada  " + aqoonsiga1 + "?");

                                        System.out.println("1.Haa");
                                        System.out.println("1.Maya");

                                        int confirm = input.nextInt();
                                        if (confirm == 1) {
                                            System.out.println("Waxaad xirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga1);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    }

                                }
                            } else if (Taaj == 6) {
                                System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                int aqoonsiga1 = input.nextInt();
                                int macluumad1 = 0;
                                macluumad1 = input.nextInt();

                                if (macluumad1 != aqoonsiga1) {
                                    System.out.println("Invalid Input ");
                                    break;
                                }
                                if (macluumad1 == aqoonsiga1) {

                                    System.out.println("Mahubtaa in aad lacag u dirto aqoonsiga xawilaada  " + aqoonsiga1 + "?");

                                    System.out.println("1.Haa");
                                    System.out.println("1.Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        System.out.println("Waxaad lacag u dirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga1);
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                }

                            }
                            break;

                            //bill paymant

                        case 9:
                            System.out.println("EVCPlus");
                            System.out.println("1. Itus haraaga bill ka \n2. Wada Bixi bill ka \n3. Qayb ka bixi bill");
                            int Bixi_Bil = input.nextInt();

                            switch (Bixi_Bil) {
                                case 1:
                                    System.out.println("Fadlan Geli bill reference number");

                                    int qofka_reference = input.nextInt();

                                    if (reference != qofka_reference) {
                                        System.out.println("Some parameters are missing. Please check your request");
                                    } else {
                                        System.out.println("Haraagaaga bill ku waa $" + haraageyga);
                                    }
                                    break;

                                case 2:
                                    System.out.println("Fadlan Geli bill reference number");
                                    int user_reference = input.nextInt();
                                    if (reference != user_reference) {
                                        System.out.println("Some parameters are missing. Please check your request");
                                    } else {
                                        System.out.println("Fadlan Geli lacagta bill ka");
                                        int lacagta_Biilka = input.nextInt();
                                        System.out.println("Ma hubtaa in aad wada bixisay lacagta bill ka una udirtay " + user_reference + " \n1.Haa \n2.Maya");
                                        int hubin_bil = input.nextInt();

                                        if (hubin_bil == 1) {
                                            if (lacagta_Biilka < 1 || lacagta_Biilka > haraageyga) {
                                                System.out.println("Haraagaagu kuguma filna");
                                                break;
                                            }
                                            haraageyga -= lacagta_Biilka;
                                            System.out.println("Waxaad wada bixisay lacagta bill ka. Waxaad na udirtay " + user_reference + ". Haraagaagu waa $" + haraageyga);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    }
                                    break;

                                case 3:
                                    System.out.println("Fadlan Geli bill reference number");
                                    int user_ref = input.nextInt();
                                    if (reference != user_ref) {
                                        System.out.println("Some parameters are missing. Please check your request");
                                    } else {
                                        System.out.println("Fadlan Geli lacagta bill ka");

                                        int lacagtaBillka = input.nextInt();
                                        System.out.println("Ma hubtaa in aad Qayb ka bixisay lacagta bill ka una udirtay " + user_ref + " \n1.Haa \n2.Maya");
                                        int hubin1 = input.nextInt();

                                        if (hubin1 == 1) {
                                            if (lacagtaBillka < 1 || lacagtaBillka > haraageyga) {
                                                System.out.println("Haraagaagu kuguma filna");
                                                break;
                                            }
                                            haraageyga -= lacagtaBillka;
                                            System.out.println("Waxaad Qayb ka bixisay lacagta bill ka. Waxaad na udirtay " + user_ref + ". Haraagaagu waa $" + haraageyga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                    }
                                    break;

                                default:
                                    System.out.println("Fadlan dooro number sax ah");
                                    break;
                            }

                            break;


                    }
                }
            }
        }
        public static void showBalance ( double balance){
            System.out.println("\n[-EVCPLUS-] Haraagaagu waa $" + balance);
        }

    public static double kuShuboInternet(Scanner input, double haraaga, String phone_number) {
        System.out.println("\nFadlan dooro number-ka ku shubeyso:");
        System.out.println("1. Isbuucle (Weekly)");
        System.out.println("2. TIME BASED PACKAGES");
        System.out.println("3. DATA");
        System.out.println("4. Maalinle (Daily)");
        System.out.println("5. Bille (MiFi)");
        System.out.print("Dooro : ");
        int internetdoro = input.nextInt();

        if (internetdoro >= 1 && internetdoro <= 5) {
            System.out.print("\nFadlan Geli lacagta: $");
            double internetlacagta = input.nextDouble();

            System.out.println("\nMa hubtaa inaad $" + internetlacagta + " ku shubatid?");
            System.out.println("1. Haa");
            System.out.println("2. Maya");
            System.out.print("Dooro : ");
            int xaqijininternet = input.nextInt();

            if (xaqijininternet == 1) {
                if (internetlacagta > haraaga) {
                    System.out.println("\nHaraaga xisaabtaadu kuguma filna, " + phone_number);
                } else {
                    haraaga -= internetlacagta;
                    System.out.println("\nWaxaad ugu shubtay $" + internetlacagta + " mobile No: " + phone_number);
                    System.out.println("Haraaga cusub waa $" + haraaga);
                }
            } else {
                System.out.println("\nMahadsanid!");
            }
        } else {
            System.out.println("\nDooro number sax ah.");
        }

        return haraaga;
    }
    }







