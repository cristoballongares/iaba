import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.math.*;
public class index{

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		// Iteradores and other things...
		int i,j,k,n=0,o=0,option,turn=1;
		int g=0;
		// Arrays para guardar las "cartas"
		int[] grupo1 = new int[7],
			  grupo2 = new int[7],
			  grupo3 = new int[7];
		// Deck
		int[] deck = new int[21];

		boolean win = false;

		// Generamos numeros sin repetirse
		int num;
		for(i=0;i<21;i++){
			num = ran.nextInt(21)+1;

			j=0;
			while(j<i){ // "algoritmo" para guardar los numeros sin que se repitan, del 1 al 21 
				if(deck[j]==num){
					j=0;
					num = ran.nextInt(21)+1;
				} else{
					j++;
				}
			}
		deck[i] = num;
		}

		/* 
		for(int x:deck){
			System.out.print(x+" ");
		}
		*/


		// Repartimos 7 cartas a cada grupo

		int z=14,w=7;
		j=0;
		for(i=0;i<7;i++){
			grupo1[i] = deck[i];
		}

		for(i=0;i<7;i++){
			grupo2[i]= deck[w];
			w++;
		}

		for(i=0;i<7;i++){
			grupo3[i]=deck[z];
			z++;
		}
		z=0;
		o=7;
		n=14;
		w=0;
		while(win==false){
			System.out.println("Ronda "+turn);
			System.out.print("Deck: ");
				for(int c:deck){
					System.out.print(c+" ");
				}
				System.out.println();
				System.out.print("Grupo 1: ");
				for(int x:grupo1){
					System.out.print(x+" ");
				}
				System.out.println();
				System.out.print("Grupo 2: ");
				for(int d:grupo2){
					System.out.print(d+" ");
				}
				System.out.println();
				System.out.print("Grupo 3: ");
				for(int e:grupo3){
					System.out.print(e+" ");
				}
				System.out.println();
				System.out.println();

				for(i=0;i<7;i++){
					System.out.print(deck[z]+"\t"+deck[o]+"\t"+deck[n]+"\n");
					z++;
					o++;
					n++;
				}


			System.out.print("En que grupo se encuentra tu carta >> ");
			option = in.nextInt();
			turn++;
			z=0;
			o=7;
			n=14;
				switch(option){
					case 1: // Hacemos la misma mamada de repartir ptm que desesperacion ayuda porfavor
						for(i=0;i<7;i++){ 
							deck[o] = grupo1[i];
							deck[z] = grupo3[i];
							deck[n] = grupo2[i];
							o++;
							z++;
							n++;
							}
							
							z=0;
							o=7;
							n=14;
							g=0;
							j=1;
							w=2;

									for(i=0;i<7;i++){
										grupo1[i] = deck[g];
										g+=3;
									}

									for(i=0;i<7;i++){
										grupo2[i]= deck[j];
										j+=3;
									}

									for(i=0;i<7;i++){
										grupo3[i]=deck[w];
										w+=3;
									}
							System.out.println();
							System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
							System.out.print("Grupo 1: ");
							for(int x:grupo1){
								System.out.print(x+" ");
							}
							System.out.println();
							System.out.print("Grupo 2: ");
							for(int d:grupo2){
								System.out.print(d+" ");
							}
							System.out.println();
							System.out.print("Grupo 3: ");
							for(int e:grupo3){
								System.out.print(e+" ");
							}
							System.out.println();

								System.out.println();

								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
							z=0;
							o=7;
							n=14;
							switch(option){
							case 1:
								z=0;
								o=7;
								n=14;
									for(i=0;i<7;i++){ 
									deck[o] = grupo1[i];
									deck[z] = grupo3[i];
									deck[n] = grupo2[i];
									o++;
									z++;
									n++;
										}
											z=0;
											o=7;
											n=14;
											g=0;
											j=1;
											w=2;
								System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
							System.out.print("Grupo 1: ");
							for(int x:grupo1){
								System.out.print(x+" ");
							}
							System.out.println();
							System.out.print("Grupo 2: ");
							for(int d:grupo2){
								System.out.print(d+" ");
							}
							System.out.println();
							System.out.print("Grupo 3: ");
							for(int e:grupo3){
								System.out.print(e+" ");
							}
							System.out.println();

								System.out.println();

								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
								if(option==1){
									System.out.print("\nLa carta es: "+deck[9]);
								}else if(option==2){
									System.out.print("\nLa carta es: "+deck[10]);
								}else if(option==3){
									System.out.print("\nLa carta es: "+deck[11]);
								}
								break;

								case 2:
								z=0;
								o=7;
								n=14;
									for(i=0;i<7;i++){ 
									deck[o] = grupo2[i];
									deck[z] = grupo3[i];
									deck[n] = grupo1[i];
									o++;
									z++;
									n++;
										}
											z=0;
											o=7;
											n=14;
											g=0;
											j=1;
											w=2;
								System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
								if(option==1){
									System.out.print("\nLa carta es: "+deck[9]);
								}else if(option==2){
									System.out.print("\nLa carta es: "+deck[10]);
								}else if(option==3){
									System.out.print("\nLa carta es: "+deck[11]);
								}

								break;
							

							case 3:
												z=0;
												o=7;
												n=14;
													for(i=0;i<7;i++){ 
													deck[o] = grupo3[i];
													deck[z] = grupo2[i];
													deck[n] = grupo1[i];
													o++;
													z++;
													n++;
														}
															z=0;
															o=7;
															n=14;
															g=0;
															j=1;
															w=2;
												System.out.print("Deck: ");
												for(int c:deck){
													System.out.print(c+" ");
												}
											System.out.println();
												for(i=1;i<22;i++){
													System.out.print(deck[z]+"\t");
													z++;
													if(i%3==0){
														System.out.println();
													}
												}

													System.out.println();
													System.out.println();


											System.out.print("\nEn que grupo se encuentra tu carta >> ");
											option = in.nextInt();
												if(option==1){
													System.out.print("\nLa carta es: "+deck[9]);
												}else if(option==2){
													System.out.print("\nLa carta es: "+deck[10]);
												}else if(option==3){
													System.out.print("\nLa carta es: "+deck[11]);
												}

												break;
											}
								break;
					case 2: // help please
						for(i=0;i<7;i++){ 
							deck[o] = grupo1[i];
							deck[z] = grupo3[i];
							deck[n] = grupo2[i];
							o++;
							z++;
							n++;
							}
							
							z=0;
							o=7;
							n=14;
							g=0;
							j=1;
							w=2;

									for(i=0;i<7;i++){
										grupo1[i] = deck[g];
										g+=3;
									}

									for(i=0;i<7;i++){
										grupo2[i]= deck[j];
										j+=3;
									}

									for(i=0;i<7;i++){
										grupo3[i]=deck[w];
										w+=3;
									}
							System.out.println();
							System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
							System.out.print("Grupo 1: ");
							for(int x:grupo1){
								System.out.print(x+" ");
							}
							System.out.println();
							System.out.print("Grupo 2: ");
							for(int d:grupo2){
								System.out.print(d+" ");
							}
							System.out.println();
							System.out.print("Grupo 3: ");
							for(int e:grupo3){
								System.out.print(e+" ");
							}
							System.out.println();

								System.out.println();

								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
							z=0;
							o=7;
							n=14;
							switch(option){
							case 1:
								z=0;
								o=7;
								n=14;
									for(i=0;i<7;i++){ 
									deck[o] = grupo1[i];
									deck[z] = grupo3[i];
									deck[n] = grupo2[i];
									o++;
									z++;
									n++;
										}
											z=0;
											o=7;
											n=14;
											g=0;
											j=1;
											w=2;
								System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
							System.out.print("Grupo 1: ");
							for(int x:grupo1){
								System.out.print(x+" ");
							}
							System.out.println();
							System.out.print("Grupo 2: ");
							for(int d:grupo2){
								System.out.print(d+" ");
							}
							System.out.println();
							System.out.print("Grupo 3: ");
							for(int e:grupo3){
								System.out.print(e+" ");
							}
							System.out.println();

								System.out.println();

								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
								if(option==1){
									System.out.print("\nLa carta es: "+deck[9]);
								}else if(option==2){
									System.out.print("\nLa carta es: "+deck[10]);
								}else if(option==3){
									System.out.print("\nLa carta es: "+deck[11]);
								}
								break;

								case 2:
								z=0;
								o=7;
								n=14;
									for(i=0;i<7;i++){ 
									deck[o] = grupo2[i];
									deck[z] = grupo3[i];
									deck[n] = grupo1[i];
									o++;
									z++;
									n++;
										}
											z=0;
											o=7;
											n=14;
											g=0;
											j=1;
											w=2;
								System.out.print("Deck: ");
								for(int c:deck){
									System.out.print(c+" ");
								}
							System.out.println();
								for(i=1;i<22;i++){
									System.out.print(deck[z]+"\t");
									z++;
									if(i%3==0){
										System.out.println();
									}
								}

									System.out.println();
									System.out.println();


							System.out.print("\nEn que grupo se encuentra tu carta >> ");
							option = in.nextInt();
								if(option==1){
									System.out.print("\nLa carta es: "+deck[9]);
								}else if(option==2){
									System.out.print("\nLa carta es: "+deck[10]);
								}else if(option==3){
									System.out.print("\nLa carta es: "+deck[11]);
								}

								break;
							

							case 3:
												z=0;
												o=7;
												n=14;
													for(i=0;i<7;i++){ 
													deck[o] = grupo3[i];
													deck[z] = grupo2[i];
													deck[n] = grupo1[i];
													o++;
													z++;
													n++;
														}
															z=0;
															o=7;
															n=14;
															g=0;
															j=1;
															w=2;
												System.out.print("Deck: ");
												for(int c:deck){
													System.out.print(c+" ");
												}
											System.out.println();
												for(i=1;i<22;i++){
													System.out.print(deck[z]+"\t");
													z++;
													if(i%3==0){
														System.out.println();
													}
												}

													System.out.println();
													System.out.println();


											System.out.print("\nEn que grupo se encuentra tu carta >> ");
											option = in.nextInt();
												if(option==1){
													System.out.print("\nLa carta es: "+deck[9]);
												}else if(option==2){
													System.out.print("\nLa carta es: "+deck[10]);
												}else if(option==3){
													System.out.print("\nLa carta es: "+deck[11]);
												}

												break;
											}
										break;
								
				}
				win = true;
			}

		

		System.out.println("");


	}


}