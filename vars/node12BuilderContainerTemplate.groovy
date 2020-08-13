def call() {
  return [
    containerTemplate(
      name: 'node12-builder',
      image: 'cypress/base:12.14.0',
      alwaysPullImage: true,
      command: 'cat',
      resourceRequestCpu: '2',
      resourceLimitCpu: '4',
      ttyEnabled: true
    )
  ]
}
