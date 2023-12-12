describe('My First test', () => {
  it('Visits the Swagger-ui', () => {
    cy.visit('http://localhost:8080/q/swagger-ui/')

    cy.contains('POST').click()
    cy.get('.try-out > .btn').click()

    
    
  
  
  })
})