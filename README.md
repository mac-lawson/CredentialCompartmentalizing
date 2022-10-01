
## CredentialCompartmentalizing
![Alt text](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fjumpcloud.com%2Fwp-content%2Fuploads%2F2016%2F07%2FAD1.png&f=1&nofb=1&ipt=55ac2b9fb2b985e7b0cc4a287200e6971348cb9bd7bb6caf40efb29b7a180846&ipo=images)

### About:
The “Active Directory Tier Model” is a logical separation of AD assets, having some kind of security boundaries in between. The idea is to protect the most valued identities within the active directory (Tier 0), while standard desktops and users (Tier2, and in some cases Tier 3) can surf the web, check their email, or access services and applications that reside on a different tier (Tier 1). Microsoft provides extensive information on the Tier Model. The implementation of such model will help significantly mitigate “Credential Theft” techniques as it could be “Pass-the-Hash” or “Pass-the-ticket”, which are the basis of todays majority security breaches.




## Developers

- [Lead: Mac Lawson](https://www.github.com/mac-lawson)



## Deployment
Info:
```
File is located in the CredentialCompartmentalizing/Credentials/src Directory

All runs of the application will show information on usage

FUN: You can customize the quote by moding CredentialCompartmentalizing/Credentials/src/Supercool.txt
```
Run:
```
java Generator.java -l (Active Directory Priv Level) \n{Domain Admin, Domain Object Admin, Server Admin, Workstation Admin, Normal User} 
```
Help: 
```
java Generator.java -h
```
Examples: 
```
java Generator.java -l "Domain Object Admin"
```

