# Journal
Checking references equality confirms that both variables point to the same object in memory. The private constructor prevents other classes from creating new ConfigurationManager objects. The static getInstance() method provides access to the one shared instance. This makes sure only one ConfigurationManager exits.

Lazy loading creates the ConfigurationManger only when it is first needed. This can save resources because the objectg is not created until getInstance() is called. The if (instance == null) check makes sure the object is only created once.

Whenever I try to run my main, I would get an error, I don't know if its really simple and Im just overlooking it or I messed up my code.
