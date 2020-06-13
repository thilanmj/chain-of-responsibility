
## Chain of Responsibility pattern

In chain of responsibility when receive request from object to chain of object.It will handle by any object with in the chain.

eg- When we try to withdraw Rs 12900 form ATM. there will be 5000 notes, 1000 notes, 500 notes and 100 notes.

Then the ATM 

             -> 5000 notes 12900/5000 = 2 notes => 2900
             -> 1000 notes  2900/1000 = 2 notes =>  900
             ->  500 notes   900/500  = 1 notes =>  400
             ->  100 notes   400/100  = 4 notes =>  100



### Advantage

* It reduces the sender and handler coupling.

### Usage

* When more than one object can handle a request and the handler unknown.
