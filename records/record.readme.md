- Records are immutable by default meaning that the fields (components) of a record are final and cannot be changed after the object is created. This ensures that the data cannot be modified.
- Records are essentially data carriers, and they automatically generate boilerplate code like constructors, toString(), equals(), and hashCode() methods.
- The purpose of a record is to represent simple data-carrying objects (sometimes called POJOs, or plain old Java objects) without the need for behavior.

# When to use a record instead of a class?
- Immutable Data: When you need to model data that is immutable and where objects represent simple, unchangeable data containers.
- No Additional Behavior: When you don't need the class to have additional behavior (methods that modify data), and you only care about holding and accessing data.
- Concise Representation: When you want to reduce boilerplate code and focus on the semantics of your data model.

# Example: 
- In many applications (e.g., e-commerce, customer databases), you may need to represent an address. An address typically contains fields such as street, city, state, and postal code, and it's not expected to change after being created (i.e., it’s immutable). Additionally, you often don't need complex behaviors for an address beyond storing and retrieving its data.
- A Person might consist of immutable data like name, age, and an Address. Once a person’s details are captured, they don't usually need to change frequently.

