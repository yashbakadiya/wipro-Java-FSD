

describe("Test suite for calculator", ()=> {
    

    it("testing even,even number passed", ()=> {
        let result = isEven(10);
        expect(result).toBeTruthy(); 

    });

    it("testing even,odd number passed", ()=> {
        let result = isEven(9);
        expect(result).toBeFalsy();

    });


    it("add, positive numbers passed",()=>{
        let result=add(5,7);
        expect(result).toEqual(12);

    });


    it("add, negative numbers passed",()=>{
        let result=add(-2,-8);
        expect(result).toEqual(-10);

    });


    it("add, undefined numbers passed",()=>{
        let result=add(undefined,-8);
        expect(result).toBeUndefined();

    });

    it("newUser, testing for id 1 ,name shivam",()=>{
        let expectation={
            id:1,
            name: "shivam"
        };
      let result=newUser(1,"shivam");
      expect(result).toEqual(expectation);
    });



    it("newUser, testing for id 2 ,name ayush",()=>{
        let expectation={
            id:2,
            name: "ayush"
        };
      let result=newUser(2,"ayush");
      expect(result).toEqual(expectation);
    });
});