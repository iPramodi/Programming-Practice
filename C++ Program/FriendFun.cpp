#include <iostream>
using namespace std;

class abc{
	int x;
	public:
		void ii(int b) 	{ x=b;			}
		void oo()		{ cout<<"From member function"<<x;		}
		friend void fun(abc obj);  // friend function
		friend class cba;		// friend class
};

class cba{
	public:
		void test(abc obj) { cout<<"\nFriend class: "<<obj.x;		}
};

void fun(abc obj){	cout<<obj.x; }

int main()
{	
abc t;	t.ii(5); t.oo(); 
cout<<"\nCalling the friend function : ";
fun(t);

cba tt; tt.test(t);
	return 0;
}