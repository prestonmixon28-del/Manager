# Journal
Checking references equality confirms that both variables point to the same object in memory. The private constructor prevents other classes from creating new ConfigurationManager objects. The static getInstance() method provides access to the one shared instance. This makes sure only one ConfigurationManager exits.
