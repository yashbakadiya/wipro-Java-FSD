const chai = require('chai');
const expect = chai.expect;
const drawPattern = require('../src/pattern.js');

describe("Pattern", function () {

    it("should be a function", function () {
        const _pattern = drawPattern;
        expect(typeof(_pattern)).equal("function");
         
    }); 
    it("should return pattern for given number of rows", function () {
        const _pattern = drawPattern(4);
        expect(_pattern).equal("   * \n  * * \n * * * \n* * * * \n"); 
    }); 
    
    it("should return error message for the invalid input row value provided", function () {
        const _pattern = drawPattern("four");
        expect(_pattern).equal("Invalid Input Type, Row Input Should Be of Type Number !!");   
    });
});
