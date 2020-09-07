male(nikolay).
male(ivan1).
male(alexander).
male(ivan2).
male(ivan3).
male(valentin).
male(alexey).
male(valeriy).
male(maxim).

mom(anna, valentin).
mom(maria, nina).
mom(zinaida,ivan3).
mom(alla, valentina).
mom(valentina, galina).
mom(valentina, tatyna).
mom(nina, elena).
mom(nina, alexey).
mom(elena, maxim).
mom(galina, ekaterina).
mom(galina, alyssa).

dad(nikolay, valentin).
dad(ivan1, nina).
dad(alexander,ivan3).
dad(ivan2, valentina).
dad(ivan3, galina).
dad(ivan3, tatyna).
dad(ivan3, tatyna).
dad(ivan3, tatyna).
dad(valery, maxim).
dad(alexey, ekaterina).
dad(alexey, alyssa).


children(X,Y):-(dad(Y,X);mom(Y,X)).
children(X,Y):-(dad(Z,X);mom(Z,X)),children(Z,Y).
parent(X,Y):-(dad(X,Y);mom(X,Y)).
parent(X,Y):-(dad(X,Z);mom(X,Z)),parent(Z,Y).
uncle(Z,C):-((dad(Y,Z),dad(Y,X),dad(X,C),Z\=X);(dad(Y,Z),dad(Y,X),mom(X,C),Z\=X)),male(Z).
aunt(Z,C):-((dad(Y,Z),dad(Y,X),dad(X,C),Z\=X);(dad(Y,Z),dad(Y,X),mom(X,C),Z\=X)),not(male(Z)).
cousin(C,Z):-((dad(Y,Z),dad(Y,X),dad(X,C),Z\=X);(dad(Y,Z),dad(Y,X),mom(X,C),Z\=X)),male(C).
fem_cousin(C,Z):-((dad(Y,Z),dad(Y,X),dad(X,C),Z\=X);(dad(Y,Z),dad(Y,X),mom(X,C),Z\=X)),not(male(C)).
granddad(C,Z):-dad(C,Y),(dad(Y,Z);mom(Y,Z)).
sister(C,Z):-((dad(X,C),dad(X,Z)),(mom(Y,C),mom(Y,Z))),C\=Z,Z\=C,not(male(C)).
first_cousin(K,C):-((dad(Y,Z),dad(Y,X),(dad(X,K);mom(X,K)),(dad(Z,C);mom(Z,C)),Z\=X)),male(K).
first_fem_cousin(K,C):-((dad(Y,Z),dad(Y,X),(dad(X,K);mom(X,K)),(dad(Z,C);mom(Z,C)),Z\=X)),not(male(K)).
spouse(Z,C):-dad(C,K),mom(Z,K).
family(Z,C):-mom(Z,C);dad(Z,C).
