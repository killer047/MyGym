// VEGAS
// Background SLideShow
// Codepen Demo
// http://vegas.jatysalvat.com



$('.kenbarn').vegas({
  overlay: true,
  transition: 'fade', 
  transitionDuration: 4000,
  delay: 10000,
  animation: 'random',
  animationDuration: 20000,
  slides: [
    { src: 'images/slider/Fitness1.jpg' },
    { src: 'images/slider/Fitness2.jpg' },
    { src: 'images/slider/Fitness3.jpg' },
    /*{ src: 'images/slider/kenburn-4.jpg' }*/
  ]
});