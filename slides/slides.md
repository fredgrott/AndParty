Android Patterns-Finite State Machines
======================================

---

Android Patterns-Finite State Machines
======================================
One of the core components of any application is a Finite State Machine that
involves:

-  A Model of behavior

-  States of that Model

-  And Communication between states

---


Slide #2
========
We can use the splash screen as an example to see some techniques...

- Extend ImageView

- Override onDraw

- use invalidate to trigger redraws of object in Handler thus
triggering a recalculation of state.

