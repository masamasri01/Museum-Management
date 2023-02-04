
import java.util.*;

import javax.swing.JFrame;

import java.text.SimpleDateFormat;

public class MMS {

	@SuppressWarnings("static-access")
	public static void main(String args[]) {

		mainview bx = new mainview ();
		bx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bx.setSize(880,600);
		bx.setVisible(true);
//bx.setResizable(false);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		museumsystem ms = new museumsystem();
		receptionist R = new receptionist();
		ArrayList<visitor> myarr = new ArrayList<visitor>();

		ArrayList<ticket> tickits = new ArrayList<ticket>();
		onetimeticket onett = new onetimeticket();
		multitimeticket multitt = new multitimeticket();
		ArrayList<guide> g = new ArrayList<guide>();
		ArrayList<guide> test = new ArrayList<guide>();
		ArrayList<regularVisitor> arrayofreg = new ArrayList<regularVisitor>();
		ArrayList<seniorVisitor> arrayofsen = new ArrayList<seniorVisitor>();
		ArrayList<visitorRecord> visitorrecord2 ;
		ArrayList<visitorRecord> visitorrecord4 ;
		int zt,zn;
		guide testt = new guide();
		ArrayList<guide> avail = new ArrayList<guide>();
//		System.out.println("Dear Receptionist, Welcome to this museum System,Please mind those Rules so as you get a satisfying  tour booking\r\n"
//				+ ">>When you issue a ticket for a visitor,this visitor should be registered before :)\r\n"
//				+ ">>when you book a tour, you'd better register the visitor,the guides and issue the ticket BEFORE \r\n"
//				+ ">>You get the senior Discount when you book the tour, so mind making sure that the visitor have\r\n"
//				+ "issued a ticket before  booking a tour so as he might've  get a discount ,IF YOU DON'T ,BOOKING TOUR WON'T BE FULLY COMPLETED OR \r\n"
//				+ "succesfully,but it will be booked , THANK YOU :)");
//		while (true) {
//			System.out.println("________________________________________________________________________________");
//			System.out.println("________________________________________________________________________________");
//
//			System.out.println("What do you want to do?");
//			System.out.println("1-ADD A VISITOR \n 2-ADD A GUIDE \n 3- Reveal Museum Working Days \n "
//					+ "4- if you want to ISSUE A TICKET for a visitor\n "
//					+ "5-if you want to GET AVAILABLE GUIDES at specific DATE \n"
//					+" 6-Delete a visitor \n 7- Edit the Information of a Visitor \n 8-Book a TOUR \n 9-EXIT");
//			System.out.println("________________________________________________________________________________");
//			System.out.println("________________________________________________________________________________");
//
			int x = in.nextInt();
			if (x == 1) {
				System.out.println("What type of visitor You want to Register 1-regular 2-senior");
				visitorrecord2 = new ArrayList<visitorRecord>();

				int e = in.nextInt();
				if (e == 1) {
					regularVisitor v1 = new regularVisitor();
					System.out.println("enter visitor id");

					int var = in.nextInt();

					v1.setId(var);
					System.out.println("enter Record id");

					int va = in.nextInt();

					v1.setRecord_id(va);
					System.out.println("enter visitor name");
					String ss = in.next();
					v1.setName(ss);
					System.out.println("enter visitor date of birth day month year in series and all in numbers");
					Date d1 = new Date();
					d1.setDate(in.nextInt());
					d1.setMonth(in.nextInt() - 1);
					d1.setYear(in.nextInt() - 1900);// because it adds 1900 by default
					v1.setDob(d1);
					v1.setVisits_count(v1.getVisits_count());
					System.out.println("what is the date of your visit add in series Day month year?");

					Date f = new Date();
					int q = in.nextInt();
					f.setDate(q);
					int q1 = in.nextInt();
					f.setMonth(q1);
					int q2 = in.nextInt();
					f.setYear(q2);
					visitorRecord nn = new visitorRecord();
					(nn).setEnteringDate(f.getDate(), f.getMonth()-1, f.getYear()-1900);
					System.out.println("what is the time of your visit add in series hour min?");
					int q3 = in.nextInt();
					f.setHours(q3);
					int qq3 = in.nextInt();
					f.setMinutes(qq3);
					nn.setEnteringTime(f.getMinutes(), f.getHours());
					visitorrecord2.add(nn);
					v1.setRecords(visitorrecord2);
					myarr.add(v1);
					ms.addvisitor(v1);
					R.registersubs(v1);
					arrayofreg.add(v1);
					System.out.print(v1);
					zn=arrayofsen.size();
					ms.setReg_count(zn);
				}
				if (e == 2)// senior
				{
					seniorVisitor vs = new seniorVisitor();
					System.out.println("enter visitor id");
					visitorrecord4 = new ArrayList<visitorRecord>();
					int var = in.nextInt();

					vs.setId(var);
					System.out.println("enter Record id");

					int va = in.nextInt();

					vs.setRecord_id(va);
					System.out.println("enter visitor name");
					String ss = in.next();
					vs.setName(ss);
					System.out.println("enter visitor day the month thn year all numbers dob ");
					Date d1 = new Date();
					d1.setDate(in.nextInt());
					d1.setMonth(in.nextInt() - 1);
					d1.setYear(in.nextInt() - 1900);
					vs.setDob(d1);
					vs.setVisits_count(vs.getVisits_count());
					System.out.println("what is the date of your visit add in series Day Month Year?");

					Date f = new Date();
					int q = in.nextInt();
					f.setDate(q);
					int q1 = in.nextInt();
					f.setMonth(q1);
					int q2 = in.nextInt();
					f.setYear(q2);
					visitorRecord nn = new visitorRecord();
					(nn).setEnteringDate(q, q1, q2);
					System.out.println("what is the time of your visit add in series hour min?");
					int q3 = in.nextInt();
					f.setHours(q3);
					int qq3 = in.nextInt();
					f.setMinutes(qq3);
					nn.setEnteringTime(q3, qq3);
					visitorrecord4.add(nn);
				vs.setRecords(visitorrecord4);
					myarr.add(vs);
					ms.addvisitor(vs);
					R.registersubs(vs);
					System.out.print(vs);
					System.out.println("\n enter Discount Rate ");
					vs.setDiscountRate(in.nextDouble());
					arrayofsen.add(vs);
					 zt=arrayofsen.size();
					ms.setsen_count(zt);
				}
			}
			// ???????????mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
			if (x == 2) {
				System.out.println("<<<<<<<<<adding guide>>>>>>>>");

				guide g1 = new guide();

				System.out.println("enter guide id");

				int var2 = in.nextInt();

				g1.setId(var2);

				System.out.println("enter guide name");

				String var3 = in.next();

				g1.setName(var3);

				System.out.println("enter guide date of birth day month year in series all in numbers ");
				java.util.Date d2 = new java.util.Date();
				d2.setDate(in.nextInt());
				d2.setMonth(in.nextInt() - 1);
				d2.setYear(in.nextInt() - 1900);
				g1.setDob(d2);

				System.out.println("enter guide's employement id");

				int var4 = in.nextInt();

				g1.setEmployeeid(var4);

				System.out.println("enter guide's hiredate ");
				java.util.Date d3 = new java.util.Date();
				d3.setDate(in.nextInt());
				d3.setMonth(in.nextInt() - 1);
				d3.setYear(in.nextInt() - 1900);
				g1.setHiredate(d3);

				ArrayList<languages> al = new ArrayList<languages>();
				System.out.println("inter the number of tounges you have ");
				int no = in.nextInt();
				System.out.println("inter the id  of the tounge you have ");
				System.out.println("1-English ");
				System.out.println("2-Arabic  ");
				System.out.println("3-Italian ");
				System.out.println("4-Turkish ");
				System.out.println("5-French ");
				for (int i = 0; i < no; i++) {
					int id = in.nextInt();
					while (id>5)
					{
						System.out.println("invalid,inter again");
						id = in.nextInt();
						
					}
					switch (id) {
					case 1:
						al.add(languages.English);
						break;
					case 2:
						al.add(languages.Arabic);
						break;
					case 3:
						al.add(languages.Italian);
						break;
					case 4:
						al.add(languages.Turkish);
						break;
					case 5:
						al.add(languages.French);
						break;

					}
					
				}
				g1.mylanguage = al;

				System.out.println("inter the number of Days you work in ");
				int num = in.nextInt();
				ArrayList<Day> wd = new ArrayList<Day>();

				while (num > 5) {
					System.out.println("please mind the maximum days you can work in,enter again ");
					num = in.nextInt();
				}
				System.out.println("inter the id  of the day u work in ");
				System.out.println("1-saturday ");
				System.out.println("2-sunday ");
				System.out.println("3-monday ");
				System.out.println("4-tuesday ");
				System.out.println("5-wednesday ");
				System.out.println("6-thursday ");
				for (int i = 0; i < num; i++) {
					int idd = in.nextInt();
					if (idd > 6) {
						System.out.println("the museum is closed,choose another day");
						idd = in.nextInt();

					} else
						switch (idd) {
						case 1:
							wd.add(Day.Saturday);
							break;

						case 2:
							wd.add(Day.Sunday);
							break;

						case 3:
							wd.add(Day.Monday);
							break;
						case 4:
							wd.add(Day.Tuesday);
							break;
						case 5:
							wd.add(Day.Wednesday);
							break;
						case 6:
							wd.add(Day.Friday);
							break;

						}
				}
				g1.setWorkingdays(wd);

				System.out.println("how many tours per day could u hadle?");
				int o = in.nextInt();
				if (o > guide.maxtoursperday)
					System.out.println("you can't work in more than maximum tours per day(3),enter again");
				while (o > g1.maxtoursperday) {
					o = in.nextInt();
				}

				g1.setToursperday(o);
				ms.addguide(g1);
				System.out.println("guide added \t" + g1);

			}
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			if (x == 3) {
				ms.printoppeningdays();
			}
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			if (x == 4) {
				if (myarr.isEmpty())
					System.out.println("there is no visitor registed to issue a ticket for");
				if (!(myarr.isEmpty())) {
					System.out.println(
							"what type of ticket u wanna issue >> if one time inter 1 , if multi time inter 2");
					int h;

					h = in.nextInt();
					if (h == 1) {
						Date qq = new Date();
						onett.setIssueDate(qq);

						System.out.println("inter the id of the owner -visitor- of this ticket");
						int ownerid = in.nextInt();
						for (visitor t : myarr) { // the ticket owner must be registered as a visitor before
							if (ownerid == t.getId())
								onett.v = t;

						}
						System.out.println(
								"Ticket is issued,The price is 50$ for all, if yor are a senior visitor you'll get a discount when you book a tour");
						tickits.add(onett);
						R.issueticket(onett);
					}

					if (h == 2) {

						Date qq2 = new Date();
						multitt.setIssueDate(qq2);

						System.out.println("inter the id of " + "the owner -visitor- of this ticket");
						int owneridd = in.nextInt();
						for (visitor vv : myarr) {
							if (vv.getId() == owneridd)// the tickeet owner must be registered as a visitor before
								multitt.v = vv;
							break;
						}

						System.out.println(
								"what is the type of multitime ticket u wanna issue ?\n 1-Daily \n 2-Monthly \n 3-yearly");
						int tu = in.nextInt();
						if (tu == 1)
							multitt.type = tickettype.daily;
						if (tu == 2)
							multitt.type = tickettype.monthly;
						if (tu == 3)
							multitt.type = tickettype.yearly;
						System.out.println(
								"Ticket is issued,The price is 200$ for all, if yor are a senior visitor you'll get a discount when you book a tour");

						tickits.add(multitt);
						R.issueticket(multitt);
					}

				}

			}
			if (x == 5) {
				System.out.print("what is the date the you wanna know who work in"
						+ "please inter the date then the month then the year(all in numbers) ");

				Date ddd = new Date();
				ddd.setDate(in.nextInt());
				ddd.setMonth(in.nextInt());
				ddd.setYear(in.nextInt());
				ArrayList<guide> available = new ArrayList<guide>();
				available = ms.getavailableguides(ddd);
				System.out.print(available);

			}

			if (x == 6) // delete sub
			{ 
				System.out.print("what is the id of the visitor that you want to remove?");
				int rr = in.nextInt();
				boolean flag = true;
				for (visitor vv : ms.v)
					if (vv.getId() == rr) {
						ms.v.remove(vv);
						flag = false;
						// R.deletesubs(vv, ms);
						System.out.println("Removed succesfully");
						break;
					}
				if (flag)
					System.out.println("this visitor does not exist here");
			}
			if (x == 7) {
				System.out.print("enter the ID of the visitor that you want to edit their information");

				int w = in.nextInt();
				System.out.print("is he a regular visitor or senior?1-regular 2-senior");
				int y = in.nextInt();
				for (visitor v : ms.v)

					if (v.getId() == w)
						R.editsubs(y, v, ms);
			}
/////////////////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////////////////////
			if (x == 8) // BOOK TOUR
			{ //regularVisitor mm=new regularVisitor();
				boolean language=false;
				System.out.println(
						"is he a regular or senior (you're a senior if this is not yor first tour? 1-regular 2-senior");

				int s = in.nextInt();
				if (s == 1) {// regular
					regularVisitor tempvis=null;
					guide temp=null;
					boolean idflag=true;
					System.out.println("inter the ID of the visitor who wants to book a tour");
					s = in.nextInt();
					for (regularVisitor rv : arrayofreg) 
						{if (rv.getId() == s)
						{idflag=false;	
							
						System.out.println("Do you want the tour with a guide or not? 1-with 2-without");
						int d =in.nextInt();
						if (d==1) {
							for (ticket t : tickits) {
								for (regularVisitor v : arrayofreg) {
									if (t.getVisitor() == v)
										t.setPrice(t.getPrice() + (int) (0.10 * t.getPrice()));
									System.out.println("this tour ticket costs you  " + t.getPrice()
											+ "$  ,10% were added for the guide");
                                 tempvis =v;
								}
							}
							System.out.println("what is the language of that the visitor talk?");
							System.out.println("1-English ");
							System.out.println("2-Arabic  ");
							System.out.println("3-Italian ");
							System.out.println("4-Turkish ");
							System.out.println("5-French ");
							languages al = null;
							int id = in.nextInt();
							switch (id) {
							case 1:
								al = (languages.English);
								break;
							case 2:
								al = (languages.Arabic);
								break;
							case 3:
								al = (languages.Italian);
								break;
							case 4:
								al = (languages.Turkish);
								break;
							case 5:
								al = (languages.French);
								break;

							}

							for (guide g4 : ms.getGuides()) {
								for (languages k : g4.getMylanguage()) {
									if (k == al) {
										temp = g4;
										language=true;
										//
										System.out
												.println("what is the date of your tour add in series day month year?");
										Date f = new Date();
										int q = in.nextInt();
										f.setDate(q);
										int q1 = in.nextInt();
										f.setMonth(q1);
										int q2 = in.nextInt();
										f.setYear(q2);

										//
										// ms.getavailableguides(f);
										if ( ms.getavailableguides(f).contains(g4)) {
											System.out.println("the guide of this tour is" + g4);
										//	mm=rv;
											//g4.myvisitors.add(mm); // assign the guide to the visitor

											rv.setVisits_count(rv.getVisits_count() + 1);
											rv.BookTour();
											tempvis.g=g4;
                        // g4.setToursperday((g4.getToursperday()+1));
										} // add a visit
										else {
											System.out.println(
													"Sorry,there is no available guide at this Date,the system will exit");
											System.exit(0);
										}
                                       break;
									} 
									
									}
								if (language==false) {
									System.out.println(
											"Sorry,there is no available guide with this language,the system will exit");
									System.exit(0);
								}
							}
						} else if (d==2)
						{
							rv.BookTour();
						System.out.println("tour booked without  guide");
						rv.setVisits_count(rv.getVisits_count() + 1);

						}
						 // temp.setToursperday((temp.getToursperday()+1));
						} 
						else if (idflag) System.out.println("THIS VISITOR DOESN'T EXIST HERE");
					}
				}

				if (s == 2) {// senior
					guide temp=null;
					seniorVisitor tempv=null;
					System.out.println("inter the ID of the visitor who wants to book a tour");
					s = in.nextInt();
					for (seniorVisitor rv : arrayofsen) {
						if (rv.getId() == s) {
						System.out.println("Do you want the tour with a guide or not? 1-with 2-without");
						int b= in.nextInt();
						if (1 == b) {
							for (ticket t : tickits) {
								for (seniorVisitor v : arrayofsen) {
									if (t.getVisitor() == v)
										t.setPrice(t.getPrice() + (int) (0.10 * t.getPrice()));
									t.setPrice(t.getPrice() - (int) (v.getDiscountRate() * t.getPrice()));
									System.out.println("this tour ticket costs you  " + t.getPrice()
											+ "$  ,10% were added for the guide,"+v.getDiscountRate() +"were discounted for being a senior");

								}
							}
							System.out.println("what is the language of that the visitor talk?");
							System.out.println("1-English ");
							System.out.println("2-Arabic  ");
							System.out.println("3-Italian ");
							System.out.println("4-Turkish ");
							System.out.println("5-French ");
							languages al = null;
							int id = in.nextInt();
							switch (id) {
							case 1:
								al = (languages.English);
								break;
							case 2:
								al = (languages.Arabic);
								break;
							case 3:
								al = (languages.Italian);
								break;
							case 4:
								al = (languages.Turkish);
								break;
							case 5:
								al = (languages.French);
								break;

							}

							for (guide g4 : ms.getGuides()) {
								for (languages k : g4.getMylanguage()) {
									if (k == al) {
										testt = g4;
										//
										System.out
												.println("what is the date of your tour add in series day month year?");
										Date f = new Date();
										int q = in.nextInt();
										f.setDate(q);
										int q1 = in.nextInt();
										f.setMonth(q1);
										int q2 = in.nextInt();
										f.setYear(q2);

										//
										avail = ms.getavailableguides(f);
										if (avail.contains(g4)) {
											System.out.println("the guide of this tour is" + g4);
										tempv.g=g4;// assign the guide to the visitor

											rv.setVisits_count(rv.getVisits_count() + 1);
											  //g4.setToursperday((g4.getToursperday()+1));

										} // add a visit
										else {
											System.out.println(
													"Sorry,there is no available guide at this Date,the system will exit");
											System.exit(0);
										}

									} else {
										System.out.println(
												"Sorry,there is no available guide with this language,the system will exit");
										System.exit(0);
									}
								}
							}
						} if (b==2) 
							{System.out.println("THIS TOUR IS WITHOUT A GUIDE");
						  
								for (ticket t : tickits) {
									for (seniorVisitor v : arrayofsen) {
										if (t.getVisitor() == v)
										t.setPrice(t.getPrice() - (int) (v.getDiscountRate()* t.getPrice()));
										System.out.println("this tour ticket costs you  " + t.getPrice()
												+ "$  ," +v.getDiscountRate()+ " were discounted for being a senior");
										rv.BookTour();}
										  
									}
								rv.setVisits_count(rv.getVisits_count() + 1);

								}
						} else System.out.println("THIS VISITOR DOESN'T EXIST HERE");
					}
					}
				}
			if (x==9)
				System.exit(1);
				if (x==10) System.out.println (ms.v);
				
			}
			
		}
	

