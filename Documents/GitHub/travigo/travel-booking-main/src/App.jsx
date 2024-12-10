import React from 'react';
import { Navbar, Hero, Footer, Memory, Explore, Advertise, Pricings, Banner, Newsletter } from './components';
import { hero, navlinks, memory, placesAPI, brands, pricingapi, bannerAPI, footerAPI } from './data/travigodata';

const App = () => {
  return (
   <>
      <Navbar navlinks={navlinks} />
        <Hero hero={hero} />
        <Memory memory={memory} />
        <Explore title="Experience  World's Amazing Adventures" placesAPI={placesAPI} />
        <Advertise brands={brands} />
        <Pricings pricingapi={pricingapi} />
        <Banner bannerAPI={bannerAPI} />
        <Newsletter />
      <Footer footerAPI={footerAPI} />
   </>
  );
};

export default App;