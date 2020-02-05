def call() {
  return [
    containerTemplate(
      name: 'node12-builder-big',
      image: 'cypress/base:12.14.0',
      alwaysPullImage: true,
      command: 'cat',
      resourceRequestCpu: '3000m',
      resourceLimitCpu: '4000m',
      ttyEnabled: true
    )
  ]
}
